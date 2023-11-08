import javax.swing.*;
import java.awt.*;

public class GrafikSiswa extends JPanel {
    private String nama;
    private String nim;

    public GrafikSiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Gambar grafik 1 dimensi di sini
        g.setColor(Color.blue);
        g.drawLine(50, 50, 200, 50); // Contoh garis horizontal

        // Tambahkan atribut siswa
        g.setColor(Color.black);
        g.drawString("Nama: " + nama, 50, 70);
        g.drawString("NIM: " + nim, 50, 90);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Grafik Siswa");
        GrafikSiswa grafik = new GrafikSiswa("Nisrina", "202043501249");
        frame.add(grafik);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
