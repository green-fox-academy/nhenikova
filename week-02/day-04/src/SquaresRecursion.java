import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.*;

public class SquaresRecursion {
    public static void mainDraw(Graphics graphics) {
        drawSquares(7, 5, 5, 729, 729, graphics);
    }

    public static void drawSquares(int level, int x, int y, int width, int height, Graphics graphics){
        if (level == 1){
            graphics.drawRect(x, y, width, height);
        } else {
            int widthSquare = Math.round(width / 3);
            int heightSquare = Math.round(height / 3);
            graphics.drawRect(x, y, width, height);
            drawSquares(level-1, x + widthSquare, y, widthSquare, heightSquare, graphics);
            drawSquares(level-1, x, y + heightSquare, widthSquare, heightSquare, graphics);
            drawSquares(level-1, x + widthSquare * 2, y + heightSquare, width - widthSquare * 2, heightSquare, graphics);
            drawSquares(level-1, x + widthSquare, y + heightSquare * 2, widthSquare, height - heightSquare * 2, graphics);
        }
    }

    // Don't touch the code below
    static int WIDTH = 740;
    static int HEIGHT = 740;

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
        public ImagePanel()
        {
            super();
            this.setOpaque(true);
            this.setBackground(Color.YELLOW);
        }
    }
}