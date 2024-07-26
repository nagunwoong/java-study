
import java.awt.Graphics;
import java.awt.Color;

public class Paddle {
    private int x, y;
    private int width = 100, height = 10;
    private int moveDistance = 20;

    public Paddle(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public void moveLeft() {
        if (x > 0) {
            x -= moveDistance;
        }
    }

    public void moveRight() {
        if (x + width < 800) {
            x += moveDistance;
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
