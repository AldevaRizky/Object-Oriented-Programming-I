package Tugas;

class Mobil {
    //Attribute warna mobil
    private String warna;
    //Attribut tahun produksi mobil
    private int tahunProduksi;

    //Constructor untuk inisialisasi object mobil dengan warna dan tahun produksi
    public Mobil(String warna, int tahunProduksi) {
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    //Method untuk menampilkan informasi mobil
    public void tampilkanInfo() {
        System.out.println("Warna mobil: " + this.warna);
        System.out.println("Tahun produksi mobil saya: " + this.tahunProduksi);
    }


}

public class Mainmobil {
    public static void main(String[] args) {
        //Membuat object mobil dengan warna kuning dan tahun produksi
        Mobil mobilSaya = new Mobil("Kuning", 2009);

        // Menampilkan Informasi mobil
        mobilSaya.tampilkanInfo();
    }
}
