public class Circle {

    private int x;
    private int y;
    private double radius;
    private String shape = "O";

    public Circle() {
        x = 0;
        y = 0;
        radius = 1.0;
    }

    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
        radius = 1.0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String draw() {
        return shape;
    }

    public String toString() {
        return draw();
    }

    public boolean equals(Circle other) {
        return this.x == other.x && this.y == other.y && this.radius == other.radius;
    }
}
