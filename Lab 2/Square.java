public class Square {

    private int x;
    private int y;
    private double sideLength;
    private String shape = "[]";

    public Square() {
        x = 0;
        y = 0;
        sideLength = 1.0;
    }

    public Square(int x, int y, double sideLength) {
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
        sideLength = 1.0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getArea() {
        return sideLength * sideLength;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public String draw() {
        return shape;
    }

    @Override
    public String toString() {
        return draw();
    }

    public boolean equals(Square other) {
        return this.x == other.x && this.y == other.y && this.sideLength == other.sideLength;
    }
}
