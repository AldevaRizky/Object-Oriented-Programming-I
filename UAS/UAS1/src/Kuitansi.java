class Kuitansi extends Mobil {
    private String namaPembeli;
    private String alamatPembeli;

    // Constructor
    public Kuitansi(String merk, int harga, double pajakPersen, String namaPembeli, String alamatPembeli) {
        super(merk, harga, pajakPersen);
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
    }

    // Getter dan Setter
    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getAlamatPembeli() {
        return alamatPembeli;
    }

    public void setAlamatPembeli(String alamatPembeli) {
        this.alamatPembeli = alamatPembeli;
    }

    // Method untuk mencetak kuitansi
    public void cetakKuitansi() {
        System.out.println("\n\nKUITANSI PEMBELIAN");
        System.out.println("---------------------------");
        System.out.println("Nama Merk Mobil : " + getMerk());
        System.out.println("Harga Mobil     : Rp " + getHarga());
        System.out.println("Pajak %         : " + getPajakPersen() + "%");
        System.out.println("Pajak (Rp)      : Rp " + hitungPajak());
        System.out.println("Total Harga     : Rp " + hitungTotalHarga());
        System.out.println("---------------------------");
        System.out.println("Nama Pembeli    : " + namaPembeli);
        System.out.println("Alamat Pembeli  : " + alamatPembeli);
        System.out.println("Keterangan      : Bapak/Ibu " + namaPembeli + " dengan alamat " + alamatPembeli +
                            " telah membeli mobil dengan merk " + getMerk() + " seharga Rp " + hitungTotalHarga() + ".");
    }
}
