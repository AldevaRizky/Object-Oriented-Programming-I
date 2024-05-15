package Tugas;

public class Mobil {
    private String warna;
    private String merk;

    public Mobil(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }

    public void maju() {
        System.out.println("Sedan " + merk + " warna " + warna + " bergerak maju");
    }

    public void mundur() {
        System.out.println("Minibus " + merk + " warna " + warna + " bergerak mundur");
    }

    public static void main(String[] args) {
        Mobil sedan = new Mobil("Kuning", "Toyota");
        sedan.maju();

        Mobil minibus = new Mobil("Kuning", "Toyota");
        minibus.mundur();
    }
}
