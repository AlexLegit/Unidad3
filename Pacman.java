package pacman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class PacmanGame extends JFrame implements KeyListener {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int PACMAN_SIZE = 30;
    private static final int PILL_SIZE = 10;
    private static final int PACMAN_SPEED = 5;

    private int pacmanX = WIDTH / 2;
    private int pacmanY = HEIGHT / 2;
    private int score = 0;

    private List<Point> pills = new ArrayList<>();
    private List<Rectangle> walls = new ArrayList<>();

    public PacmanGame() {
        setTitle("Pacman Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(Color.BLACK); 
        addKeyListener(this);

        // Generate pills
        for (int i = 0; i < 20; i++) {
            int x = (int) (Math.random() * WIDTH);
            int y = (int) (Math.random() * HEIGHT);
            pills.add(new Point(x, y));
        }

        // Add walls
        walls.add(new Rectangle(0, 0, 20, 20)); 
        walls.add(new Rectangle(800, 300, 40, 20));
        walls.add(new Rectangle(300, 300, 40, 20));
        walls.add(new Rectangle(300, 30, 100, 200));
        walls.add(new Rectangle(600, 300, 40, 200));
        walls.add(new Rectangle(0, 0, 20, 50)); 
        walls.add(new Rectangle(WIDTH - 20, 0, 20, HEIGHT)); 
        walls.add(new Rectangle(0, HEIGHT - 20, WIDTH, 20)); 
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.RED);
        for (Point pill : pills) {
            g2d.fillRect(pill.x, pill.y, PILL_SIZE, PILL_SIZE);
        }

        g2d.setColor(Color.YELLOW);
        g2d.fillArc(pacmanX, pacmanY, PACMAN_SIZE, PACMAN_SIZE, 45, 270);

        g2d.setColor(Color.BLUE); 
        for (Rectangle wall : walls) {
            g2d.fillRect(wall.x, wall.y, wall.width, wall.height);
        }

        g2d.setColor(Color.WHITE);
        g2d.drawString("Score: " + score, 10, 20);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_A:
                tryMove(-PACMAN_SPEED, 0); // Move left
                break;
            case KeyEvent.VK_D:
                tryMove(PACMAN_SPEED, 0); // Move right
                break;
            case KeyEvent.VK_W:
                tryMove(0, -PACMAN_SPEED); // Move up
                break;
            case KeyEvent.VK_S:
                tryMove(0, PACMAN_SPEED); // Move down
                break;
        }

        // Collision detection with pills
        Rectangle pacmanRect = new Rectangle(pacmanX, pacmanY, PACMAN_SIZE, PACMAN_SIZE);
        for (Point pill : new ArrayList<>(pills)) {
            Rectangle pillRect = new Rectangle(pill.x, pill.y, PILL_SIZE, PILL_SIZE);
            if (pacmanRect.intersects(pillRect)) {
                pills.remove(pill);
                score++;
            }
        }

        repaint();
    }

    private void tryMove(int dx, int dy) {
        Rectangle newPacmanRect = new Rectangle(pacmanX + dx, pacmanY + dy, PACMAN_SIZE, PACMAN_SIZE);
        boolean canMove = true;
        for (Rectangle wall : walls) {
            if (newPacmanRect.intersects(wall)) {
                canMove = false;
                break;
            }
        }
        if (canMove) {
            pacmanX += dx;
            pacmanY += dy;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PacmanGame game = new PacmanGame();
            game.setVisible(true);
        });
    }
}
