import java.awt.Color;
import java.awt.Graphics;
public class Shape {

    private int x;
    private int y;
    private Color color;

    public Shape() {
        this.x = 0;
        this.y = 0;
        this.color = Color.BLACK;
    }

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public double getArea() {
        return -1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(Graphics g) {

    }

    @Override
    public String toString() {
        return  "Shape at (" + x + ", " + y + ") " + color;
    }

    @Override
    public boolean equals(Object obj) {
        Shape other = (Shape) obj;
        return this.x == other.x &&
                this.y == other.y &&
                this.color.equals(other.color);
    }
}

