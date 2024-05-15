package Latihan;

public class MainSiswa2 {
    public static void main(String[] args) {
        Siswa2 Siswa1 = new Siswa2("Bu Dani", "anggrek");
        Siswa2 Siswa2 = new Siswa2("Pak Yoga", "Pinguin");

        System.out.println("Object Siswa1");
        Siswa1.cetakInfo();
        System.out.println("--------------------------");
        System.out.println("Object Siswa2");
        Siswa2.cetakInfo();
        
        // Panggil fungsi BiayaTrip
        Siswa2.BiayaTrip(350000); 
    }
}