package Tugas;

// Parent Class: ShapeRuang
class ShapeRuang {
    // Method deskripsiShape
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
public class Main {
    public static void main(String[] args) {
        // Objek segitiga
        Segitiga segitiga = new Segitiga(5, 7);
        segitiga.deskripsiShape(); // Output: Semua bangun mempunyai luas dan keliling
        System.out.println("Luas segitiga: " + segitiga.luasSegitiga()); // Output: Luas segitiga: 17.5
        
        // Objek lingkaran
        Lingkaran lingkaran = new Lingkaran(3);
        lingkaran.deskripsiShape(); // Output: Semua bangun mempunyai luas dan keliling
        System.out.println("Luas lingkaran: " + lingkaran.luasLingkaran()); // Output: Luas lingkaran: 28.274333882308138
    }
}
