package Latihan;

public class MainDosen {
    public static void main(String[] args) {
        Dosen dsn1 = new Dosen();
        dsn1.setNama("Bu Dani");
        dsn1.setProdi("Informatika");
        Dosen dsn2 = new Dosen();
        dsn2.setNama("Pak Yoga");
        dsn2.setProdi("Informatika");

        System.out.println("Object dsn1");
        System.out.println("Nama Dosen: " + dsn1.nama);
        System.out.println("Nama Prodi: " + dsn1.prodi);

        System.out.println("-----------------------");

        System.out.println("Object dsn2");
        System.out.println("Nama Dosen: " + dsn2.nama);
        System.out.println("Nama Prodi: " + dsn2.prodi);
    }
}