import java.util.Scanner;

class Karyawan {
    private int jamKerja;

    public Karyawan(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int hitungGaji() {
        int gajiNormal = 3000;
        int gajiTambahan = 5000;
        int potonganGaji = 1000;

        int gaji;

        if (jamKerja >= 60 && jamKerja <= 70) {
            gaji = jamKerja * gajiNormal;
        } else if (jamKerja > 70) {
            int jamNormal = 70;
            int jamTambahan = jamKerja - jamNormal;

            int gajiNormalTotal = jamNormal * gajiNormal;
            int gajiTambahanTotal = jamTambahan * gajiTambahan;

            gaji = gajiNormalTotal + gajiTambahanTotal;
        } else if (jamKerja < 50) {
            int jamKurang = 50 - jamKerja;
            gaji = (gajiNormal - potonganGaji) * jamKerja;
        } else {
            gaji = jamKerja * gajiNormal;
        }

        return gaji;
    }
}

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam kerja per minggu: ");
        int jamKerja = scanner.nextInt();

        Karyawan karyawan = new Karyawan(jamKerja);
        int gaji = karyawan.hitungGaji();

        System.out.println("Total gaji karyawan adalah: Rp " + gaji);

        scanner.close();
    }
}