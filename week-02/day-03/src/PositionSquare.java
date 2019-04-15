import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void mainDraw (Graphics graphics) {
        // create a square drawing function that takes 3 parameters:
        // the x and y coordinates of the square's top left corner and the graphics
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.
       newSquares(10, graphics);
    }

    public static void newSquares (int numSquares, Graphics graphics) {
        for (int i = 0; i < numSquares; i++) {
            Color color = new Color ((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256));
            int size = 50;
            int ranX = (int)(Math.random() * (WIDTH - size));
            int ranY = (int)(Math.random() * (HEIGHT - size));
            int ranWidth = size;
            int ranHeight = size;


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