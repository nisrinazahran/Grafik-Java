import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class contoh extends JPanel{
    public void paintComponent(Graphics g) {
        g.drawLine (25,25,75,75);
    }
    public static void main (String[]bebas){
        JFrame f = new JFrame();
        contoh bs = new contoh();
        f.getContentPane ().add(bs);
        f.setSize(new Dimension (500,500));
        f.setVisible(true);
    }
}