import java.util.Scanner;

public class JuaraLomba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input nilai Kimia dan Matematika
        System.out.print("Masukkan nilai Kimia: ");
        int nilaiKimia = input.nextInt();

        System.out.print("Masukkan nilai Matematika: ");
        int nilaiMatematika = input.nextInt();

        // Menentukan pemenang berdasarkan ketentuan
        if (nilaiKimia > 84 && nilaiMatematika > 89) {
            System.out.println("Selamat! Anda adalah pemenang lomba karya ilmiah.");
        } else {
            System.out.println("Maaf, Anda kalah dalam lomba karya ilmiah.");
        }

        input.close();
    }
}
