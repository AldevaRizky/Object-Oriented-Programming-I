package Tugas;

import java.util.Scanner;

// Parent Class: ShapeRuang
class ShapeRuang {
    public void deskripsiShape() {
        System.out.println("Semua bangun mempunyai luas dan keliling");
    }
}

// Child Class: Segitiga
class Segitiga extends ShapeRuang {
    private double alas;
    private double tinggi;

    // Constructor
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Method LuasSegitiga
    public double luasSegitiga() {
        return 0.5 * alas * tinggi;
    }
}

// Child Class: Lingkaran
class Lingkaran extends ShapeRuang {
    private double jariJari;

    // Constructor
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method LuasLingkaran
    public double luasLingkaran() {
        return Math.PI * jariJari * jariJari;
    }
}

// Main Class
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Objek segitiga
        System.out.print("Masukkan alas segitiga: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = scanner.nextDouble();
        Segitiga segitiga = new Segitiga(alas, tinggi);

        // Objek lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();
        Lingkaran lingkaran = new Lingkaran(jariJari);

        // Menampilkan deskripsi dan luas
        segitiga.deskripsiShape();
        System.out.println("Luas segitiga: " + segitiga.luasSegitiga());

        lingkaran.deskripsiShape();
        System.out.println("Luas lingkaran: " + lingkaran.luasLingkaran());

        scanner.close();
    }
}
