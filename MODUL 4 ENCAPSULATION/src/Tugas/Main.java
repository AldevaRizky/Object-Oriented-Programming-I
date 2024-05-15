package Tugas;
// Class Parent Manusia
class Manusia {
    private String nama;
    private String alamat;

    // Constructor
    public Manusia(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Getter alamat
    public String getAlamat() {
        return alamat;
    }

    // Method TampilNama
    public void TampilNama() {
        System.out.println("Manusia dengan nama Pak " + nama);
    }

    // Method TampilAlamat
    public void TampilAlamat() {
        System.out.println("Manusia dengan nama Pak " + nama + " alamat di " + alamat);
    }
}

// Child Class Dosen
class Dosen extends Manusia {
    private String NIDN;
    private String jenisKelamin;
    private String keahlian;

    // Constructor
    public Dosen(String nama, String alamat, String NIDN, String jenisKelamin, String keahlian) {
        super(nama, alamat);
        this.NIDN = NIDN;
        this.jenisKelamin = jenisKelamin;
        this.keahlian = keahlian;
    }

    // Method DetailDosen
    public void DetailDosen() {
        System.out.println("Pak " + getNama() + " Dosen " + jenisKelamin + " dengan NIDN " + NIDN +
                " adalah seorang dosen dengan keahlian " + keahlian);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Membuat objek Manusia
        Manusia manusia = new Manusia("Yoga", "Ponorogo");
        
        // Memanggil method TampilNama dan TampilAlamat dari class Parent Manusia
        manusia.TampilNama(); // Output: Manusia dengan nama Pak Yoga
        manusia.TampilAlamat(); // Output: Manusia dengan nama Pak Yoga alamat di Ponorogo

        // Membuat objek Dosen
        Dosen dosen = new Dosen("Yoga", "Ponorogo", "0722233399", "laki-laki", "Multimedia");

        // Memanggil method DetailDosen dari class Child Dosen
        dosen.DetailDosen();
        // Output: Pak Yoga Dosen laki-laki dengan NIDN 0722233399 adalah seorang dosen dengan keahlian Multimedia
    }
}
