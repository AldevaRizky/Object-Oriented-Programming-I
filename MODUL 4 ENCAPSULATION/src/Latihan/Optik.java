package Latihan;

public class Optik extends Lensa{
public int paket;
public Optik(String nama, String diagnosa, int harga, int paket){
    super.nama = nama;
    super.diagnosa = diagnosa;
    super.harga = harga;
    this.paket = paket;
}    
public void punyaPaket(){
    System.out.println(this.nama + " punya paket "+ this.paket);
}
}
