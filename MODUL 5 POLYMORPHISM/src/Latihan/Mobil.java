package Latihan;

// Class Mobil
public class Mobil extends Kendaran {
    // Constructor
    public Mobil(String nama, String merek) {
        this.nama = nama;
        this.merek = merek;
    }

    // Override method punyaRoda
    @Override
    public void punyaRoda() {
        System.out.println(this.nama + ": adalah kendaraan mobil yang punya roda 4");
    }
}