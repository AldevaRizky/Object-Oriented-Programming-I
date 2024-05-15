package Latihan;

public class Lensa {
    public String nama, diagnosa;
    public int harga;
    public int getHarga(){
        return this.harga;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    protected void tampilHarga(){
        System.out.println(this.nama + " memiliki harga " +getHarga());
    }
    
}
