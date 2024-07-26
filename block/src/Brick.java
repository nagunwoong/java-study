
import java.awt.Graphics;
import java.awt.Color;

public class Brick {
    private int x, y;
    private int width = 80, height = 30;
    private boolean destroyed;

    public Brick(int startX, int startY) {
        this.x = startX;
        this.y = startY;
        this.destroyed = false;
    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, width, height);
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
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
