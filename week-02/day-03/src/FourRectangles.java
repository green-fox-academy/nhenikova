import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        randomRectangles(40, graphics);

    }

    public static void randomRectangles (int numSquares, Graphics graphics){
        for (int i = 0; i < numSquares; i++) {
        Color color = new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256));
        int ranX = (int)(Math.random() * WIDTH);
        int ranY = (int)(Math.random() * HEIGHT);
        int ranWidth = (int)(Math.random() * (WIDTH - ranX));
        int ranHeight = (int)(Math.random() * (HEIGHT - ranY));

        graphics.setColor(color);
        graphics.drawRect(ranX, ranY, ranWidth, ranHeight);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
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
    }
}