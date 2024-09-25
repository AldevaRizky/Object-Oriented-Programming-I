import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    public String cetakKuitansi() {
        StringBuilder sb = new StringBuilder();
        sb.append("KUITANSI PEMBELIAN\n");
        sb.append("---------------------------\n");
        sb.append("Nama Merk Mobil : ").append(getMerk()).append("\n");
        sb.append("Harga Mobil     : Rp ").append(getHarga()).append("\n");
        sb.append("Pajak %         : ").append(getPajakPersen()).append("%\n");
        sb.append("Pajak (Rp)      : Rp ").append(hitungPajak()).append("\n");
        sb.append("Total Harga     : Rp ").append(hitungTotalHarga()).append("\n");
        sb.append("---------------------------\n");
        sb.append("Nama Pembeli    : ").append(namaPembeli).append("\n");
        sb.append("Alamat Pembeli  : ").append(alamatPembeli).append("\n");
        sb.append("Keterangan      : Bapak/Ibu ").append(namaPembeli).append(" dengan alamat ").append(alamatPembeli)
          .append(" telah membeli mobil dengan merk ").append(getMerk()).append(" seharga Rp ").append(hitungTotalHarga()).append(".");
        return sb.toString();
    }
}

public class Main extends JFrame {
    private JTextField merkField;
    private JTextField hargaField;
    private JTextField pajakField;
    private JTextField namaPembeliField;
    private JTextField alamatPembeliField;
    private JTextArea kuitansiArea;

    public Main() {
        // Setting JFrame
        setTitle("Program Kuitansi Pembelian Mobil");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel input
        JPanel inputPanel = new JPanel(new GridLayout(6, 2));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Input Data Mobil"));

        // Label dan Text Field
        inputPanel.add(new JLabel("Nama Merk Mobil:"));
        merkField = new JTextField();
        inputPanel.add(merkField);

        inputPanel.add(new JLabel("Harga Mobil (Rp):"));
        hargaField = new JTextField();
        inputPanel.add(hargaField);

        inputPanel.add(new JLabel("Pajak (%):"));
        pajakField = new JTextField();
        inputPanel.add(pajakField);

        inputPanel.add(new JLabel("Nama Pembeli:"));
        namaPembeliField = new JTextField();
        inputPanel.add(namaPembeliField);

        inputPanel.add(new JLabel("Alamat Pembeli:"));
        alamatPembeliField = new JTextField();
        inputPanel.add(alamatPembeliField);

        JButton cetakButton = new JButton("Cetak Kuitansi");
        cetakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String merk = merkField.getText();
                int harga = Integer.parseInt(hargaField.getText());
                double pajak = Double.parseDouble(pajakField.getText());
                String namaPembeli = namaPembeliField.getText();
                String alamatPembeli = alamatPembeliField.getText();

                Kuitansi kuitansi = new Kuitansi(merk, harga, pajak, namaPembeli, alamatPembeli);
                kuitansiArea.setText(kuitansi.cetakKuitansi());
            }
        });
        inputPanel.add(cetakButton);

        // Area output kuitansi
        kuitansiArea = new JTextArea();
        kuitansiArea.setEditable(false);
        kuitansiArea.setBorder(BorderFactory.createTitledBorder("Kuitansi Pembelian"));

        // Menambahkan komponen ke frame
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(kuitansiArea), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
