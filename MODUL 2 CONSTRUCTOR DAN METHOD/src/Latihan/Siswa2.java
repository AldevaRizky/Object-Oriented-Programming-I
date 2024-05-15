package Latihan;

public class Siswa2 {
    public String nama, kelas;
    
    public Siswa2(String nama, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
    }
    
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
    }

    public void BiayaTrip(int biaya) {
        if (biaya >= 300000) {
            System.out.println("Biaya Trip Lunas");
        } else {
            System.out.println("Biaya Trip Maksimal " + biaya + " Rupiah");
        }
    }
}
