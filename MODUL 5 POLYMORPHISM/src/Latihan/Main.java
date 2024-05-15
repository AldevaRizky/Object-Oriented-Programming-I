package Latihan;

// Class Main
public class Main {
    public static void main(String[] args) {
        // Objek kendaraan1 dari class Kendaran
        Kendaran kendaraan1 = new Kendaran();
        kendaraan1.punyaRoda();

        // Objek kendaraan2 dari class Mobil
        Kendaran kendaraan2 = new Mobil("Avanza", "Toyota");
        kendaraan2.punyaRoda();

        // Objek kendaraan3 dari class Motor
        Kendaran kendaraan3 = new Motor("Revo", "Honda");
        kendaraan3.punyaRoda();
    }
}