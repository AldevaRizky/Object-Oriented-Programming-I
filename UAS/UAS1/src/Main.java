import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Nama Merk Mobil: ");
        String namaMerkMobil = scanner.nextLine();

        System.out.print("Harga Mobil: Rp ");
        int hargaMobil = scanner.nextInt();

        System.out.print("Pajak (%): ");
        double pajakPersentase = scanner.nextDouble();
        scanner.nextLine(); // Mengkonsumsi newline

        System.out.print("Nama Pembeli: ");
        String namaPembeli = scanner.nextLine();

        System.out.print("Alamat Pembeli: ");
        String alamatPembeli = scanner.nextLine();

        // Membuat objek Kuitansi
        Kuitansi kuitansi = new Kuitansi(namaMerkMobil, hargaMobil, pajakPersentase, namaPembeli, alamatPembeli);

        // Mencetak kuitansi
        kuitansi.cetakKuitansi();
    }
}
