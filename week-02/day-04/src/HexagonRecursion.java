import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HexagonRecursion {
    public static void mainDraw(Graphics graphics) {
    Polygon hexagon = new Polygon();
    graphics.drawPolygon();
    int xpoints[] = {}
    int ypoints[] =

    }

    // Don't touch the code below
    static int WIDTH = 740;
    static int HEIGHT = 740;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        SquaresRecursion.ImagePanel panel = new SquaresRecursion.ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
        public ImagePanel()
        {
            super();
            this.setOpaque(true);
            this.setBackground(Color.YELLOW);
        }
    }
}

