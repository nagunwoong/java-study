
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    private Ball ball;
    private Paddle paddle;
    private ArrayList<Brick> bricks;
    private Timer timer;
    private boolean gameRunning;

    public GamePanel() {
        ball = new Ball(400, 300);
        paddle = new Paddle(350, 550);
        bricks = new ArrayList<>();
        int rows = 5;
        int cols = 8;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                bricks.add(new Brick(col * 100 + 10, row * 40 + 50));
            }
        }
        timer = new Timer(10, this);
        timer.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        gameRunning = true;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (gameRunning) {
            ball.draw(g);
            paddle.draw(g);
            for (Brick brick : bricks) {
                if (!brick.isDestroyed()) {
                    brick.draw(g);
                }
            }
        } else {
            g.setColor(Color.BLACK);
            g.drawString("Game Over", 350, 300);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameRunning) {
            ball.move();
            ball.checkCollision(paddle, bricks);
            if (ball.getY() > getHeight()) {
                gameRunning = false;
            }
            repaint();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (gameRunning) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                paddle.moveLeft();
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                paddle.moveRight();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}
}
