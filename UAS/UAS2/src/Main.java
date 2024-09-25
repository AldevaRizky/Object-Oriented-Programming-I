import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String jdbcURL = "jdbc:mysql://localhost:3306/db_kuitansi";
        String dbUser = "root"; 
        String dbPassword = ""; 

        try {
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Ambil data merk mobil yang tersedia
            String sqlStok = "SELECT id, merk, harga, stok FROM stok_mobil WHERE stok > 0";
            PreparedStatement statementStok = connection.prepareStatement(sqlStok);
            ResultSet resultSetStok = statementStok.executeQuery();

            System.out.println("Daftar Mobil yang Tersedia:");
            while (resultSetStok.next()) {
                int id = resultSetStok.getInt("id");
                String merk = resultSetStok.getString("merk");
                int harga = resultSetStok.getInt("harga");
                int stok = resultSetStok.getInt("stok");
                System.out.println(id + ". " + merk + " - Harga: Rp " + harga + " - Stok: " + stok);
            }

            System.out.print("\nPilih ID Mobil yang Ingin Dibeli: ");
            int idMobil = scanner.nextInt();
            scanner.nextLine(); 

            // Ambil detail mobil berdasarkan ID
            String sqlDetailMobil = "SELECT merk, harga FROM stok_mobil WHERE id = ?";
            PreparedStatement statementDetailMobil = connection.prepareStatement(sqlDetailMobil);
            statementDetailMobil.setInt(1, idMobil);
            ResultSet resultSetDetailMobil = statementDetailMobil.executeQuery();

            if (resultSetDetailMobil.next()) {
                String namaMerkMobil = resultSetDetailMobil.getString("merk");
                int hargaMobil = resultSetDetailMobil.getInt("harga");

                System.out.print("Pajak (%): ");
                double pajakPersentase = scanner.nextDouble();
                scanner.nextLine(); 

                System.out.print("Nama Pembeli: ");
                String namaPembeli = scanner.nextLine();

                System.out.print("Alamat Pembeli: ");
                String alamatPembeli = scanner.nextLine();

                // Membuat objek Kuitansi
                Kuitansi kuitansi = new Kuitansi(namaMerkMobil, hargaMobil, pajakPersentase, namaPembeli, alamatPembeli);

                // Simpan data pembelian ke database
                String sqlInsert = "INSERT INTO pembelian (merk, harga, pajak_persen, nama_pembeli, alamat_pembeli, pajak, total_harga) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement statementInsert = connection.prepareStatement(sqlInsert);
                statementInsert.setString(1, namaMerkMobil);
                statementInsert.setInt(2, hargaMobil);
                statementInsert.setDouble(3, pajakPersentase);
                statementInsert.setString(4, namaPembeli);
                statementInsert.setString(5, alamatPembeli);
                statementInsert.setInt(6, kuitansi.hitungPajak());
                statementInsert.setInt(7, kuitansi.hitungTotalHarga());

                int rows = statementInsert.executeUpdate();

                if (rows > 0) {
                    System.out.println("Data pembelian telah disimpan ke database.");
                }

                // Kurangi stok mobil
                String sqlUpdateStok = "UPDATE stok_mobil SET stok = stok - 1 WHERE id = ?";
                PreparedStatement statementUpdateStok = connection.prepareStatement(sqlUpdateStok);
                statementUpdateStok.setInt(1, idMobil);
                statementUpdateStok.executeUpdate();

                // Mencetak kuitansi
                kuitansi.cetakKuitansi();
            } else {
                System.out.println("Mobil dengan ID tersebut tidak ditemukan.");
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
