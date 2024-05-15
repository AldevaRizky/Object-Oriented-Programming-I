package Tugas;
import java.util.Scanner;

// Kelas PersegiPanjang
class PersegiPanjang {
    // Atribut panjang
    private double panjang;
    // Atribut lebar
    private double lebar;

    // Constructor untuk inisialisasi objek PersegiPanjang dengan panjang dan lebar tertentu
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menghitung luas persegi panjang
    public double hitungLuas() {
        return panjang * lebar;
    }
}

public class MainHitungLuasPersegiPanjang {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mendapatkan input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan panjang dan lebar
        System.out.print("Masukkan Panjang : ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan Lebar : ");
        double lebar = scanner.nextDouble();

        // Membuat objek persegi panjang dengan panjang dan lebar yang diinputkan
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        // Menghitung dan menampilkan luas persegi panjang
        System.out.println("Luas Persegi Panjang = " + persegiPanjang.hitungLuas());

        // Menutup scanner
        scanner.close();
    }
}
