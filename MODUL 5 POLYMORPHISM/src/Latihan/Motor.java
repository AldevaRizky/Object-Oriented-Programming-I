package Latihan;

// Class Motor
public class Motor extends Kendaran {
    // Constructor
    public Motor(String nama, String merek) {
        this.nama = nama;
        this.merek = merek;
    }

    // Override method punyaRoda
    @Override
    public void punyaRoda() {
        System.out.println(this.nama + ": adalah kendaraan motor yang punya roda 2");
    }
}