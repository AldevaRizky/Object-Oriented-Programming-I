package Tugas;

// Class Parent Karyawan
class Karyawan {
    String nama;
    String jabatan;
    
    public void TampilNama() {
        System.out.println("Karyawan dengan nama " + nama);
    }
    
    public void TampilJabatan() {
        System.out.println("Karyawan dengan jabatan " + jabatan);
    }
}

// Child Class Pimpinan
class Pimpinan extends Karyawan {
    String NIK;
    double tunjangan;
    
    public void detailPimpinan() {
        System.out.println(nama + " adalah pimpinan personalia");
        System.out.println(nama + " memiliki NIK " + NIK);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Membuat objek Karyawan
        Karyawan karyawan = new Karyawan();
        karyawan.nama = "Cinta";
        karyawan.jabatan = "Direktur";
        
        // Memanggil method TampilNama dan TampilJabatan dari class Parent Karyawan
        karyawan.TampilNama(); // Output: Karyawan dengan nama Cinta
        karyawan.TampilJabatan(); // Output: Karyawan dengan jabatan Direktur
        
        // Membuat objek Pimpinan
        Pimpinan pimpinan = new Pimpinan();
        pimpinan.nama = "Cinta";
        pimpinan.jabatan = "Direktur";
        pimpinan.NIK = "07223456";
        
        // Memanggil method detailPimpinan dari class Child Pimpinan
        pimpinan.detailPimpinan();
        // Output:
        // Cinta adalah pimpinan personalia
        // Cinta memiliki NIK 07223456
    }
}
