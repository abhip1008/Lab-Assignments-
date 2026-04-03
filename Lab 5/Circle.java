import java.awt.*;
public class Circle extends Shape{
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius > 0) {
            this.radius = radius;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawOval(getX(), getY(), radius * 2, radius * 2);
    }

    public static void main(String[] args) {
        Circle c = new Circle(10, 10, 20);
        System.out.println("Area: " + c.getArea());
    }
}
