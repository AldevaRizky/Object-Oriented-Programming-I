class Mobil {
    private String merk;
    private int harga;
    private double pajakPersen;

    // Constructor
    public Mobil(String merk, int harga, double pajakPersen) {
        this.merk = merk;
        this.harga = harga;
        this.pajakPersen = pajakPersen;
    }

    // Getter dan Setter
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public double getPajakPersen() {
        return pajakPersen;
    }

    public void setPajakPersen(double pajakPersen) {
        this.pajakPersen = pajakPersen;
    }

    // Method untuk menghitung pajak dalam rupiah
    public int hitungPajak() {
        return (int) (harga * (pajakPersen / 100));
    }

    // Method untuk menghitung total harga
    public int hitungTotalHarga() {
        return harga + hitungPajak();
    }
}
