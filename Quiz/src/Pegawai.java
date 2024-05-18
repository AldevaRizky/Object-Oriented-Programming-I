import java.util.Scanner;

public class Pegawai {
    String NIK;
    String Nama;
    double Gaji;

    public Pegawai(String NIK, String Nama, double Gaji) {
        this.NIK = NIK;
        this.Nama = Nama;
        this.Gaji = Gaji;
    }

    public double hitungGajiLama(double Lembur) {
        return Gaji + Lembur;
    }

    public double hitungGajiBaru(double Bonus) {
        return Gaji + Bonus;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data pegawai
        System.out.print("Masukkan NIK: ");
        String NIK = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String Nama = scanner.nextLine();
        System.out.print("Masukkan Gaji Pegawai: Rp. ");
        double Gaji = scanner.nextDouble();

        Pegawai pegawai = new Pegawai(NIK, Nama, Gaji);

        double totalGaji = 0;
        String status = "";

        if (Gaji >= 5000000) {
            System.out.print("Masukkan Lembur: Rp. ");
            double Lembur = scanner.nextDouble();
            totalGaji = pegawai.hitungGajiLama(Lembur);
            status = "Pegawai Lama";
        } else {
            System.out.print("Masukkan Bonus: Rp. ");
            double Bonus = scanner.nextDouble();
            totalGaji = pegawai.hitungGajiBaru(Bonus);
            status = "Pegawai Baru";
        }

        // Output informasi pegawai
        System.out.println("\nDATA PENGGAJIAN");
        System.out.println("-----------------");
        System.out.println("NIK: " + pegawai.NIK);
        System.out.println("Nama Pegawai: " + pegawai.Nama);
        System.out.println("Status: " + status);
        System.out.println("Total Gaji: Rp. " + totalGaji);

        scanner.close();
    }
}
