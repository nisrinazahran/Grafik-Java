import javax.swing.*;
import java.awt.*;
import java.awt.Polygon;

public class ConcavePolygonExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Concave Polygon Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.add(new ConcavePolygonPanel());
            frame.setVisible(true);
        });
    }
}

class ConcavePolygonPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int[] xPoints = {100, 150, 200, 200, 150, 100};
        int[] yPoints = {100, 50, 100, 200, 250, 200};
        int nPoints = 6;

        Polygon concavePolygon = new Polygon(xPoints, yPoints, nPoints);

        g2d.setColor(Color.blue);
        g2d.fill(concavePolygon);

        g2d.setColor(Color.black);
        g2d.draw(concavePolygon);
    }
}
