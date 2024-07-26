
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;

public class Ball {
    private int x, y;
    private int diameter = 20;
    private int xVelocity = 2, yVelocity = 3;

    public Ball(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;

        // 벽 충돌
        if (x < 0 || x > 800 - diameter) {
            xVelocity = -xVelocity;
        }

        if (y < 0) {
            yVelocity = -yVelocity;
        }
        if (y > 600) {

        }

    }

    public void checkCollision(Paddle paddle, ArrayList<Brick> bricks) {
        // 패들 충돌
        if (x + diameter >= paddle.getX() && x <= paddle.getX() + paddle.getWidth() &&
                y + diameter >= paddle.getY() && y <= paddle.getY() + paddle.getHeight()) {
            yVelocity = -yVelocity;
        }

        // 벽돌 충돌
        for (Brick brick : bricks) {
            if (!brick.isDestroyed() &&
                    x + diameter >= brick.getX() && x <= brick.getX() + brick.getWidth() &&
                    y + diameter >= brick.getY() && y <= brick.getY() + brick.getHeight()) {
                yVelocity = -yVelocity;
                brick.setDestroyed(true);
                break;
            }
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, diameter, diameter);
    }

    public int getY() {
        return y;
    }
}
