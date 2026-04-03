/**
 * Point2D represents a point in 2D space using x and y coordinates
 *
 * Answer to question 1:
 * Methods that are inside this class can directly access x and y.
 *
 * Answer to question 2:
 * Methods outisde this class cannot access x and y directly, they have
 * to use the getters and setters to do so.
 *
 * Answer to question 3:
 * No, x and y are instance variables. Each Point2D object has its own x and y
 *
 * Answer to question 4:
 * It tells the complier that the method is supposed override a method
 * from its ancestor.
 *
 * Answer to question 5:
 * println automatically calls toString on objects.
 */
public class Point2D {
    private int x;
    private int y;

    public Point2D() {
        x = 0;
        y = 0;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this. y = y;
    }

    public Point2D(Point2D other) {
        this.x = other.x;
        this.y = other.y;
    }

    public void setX(int nx) {
        x = nx;
    }

    public void setY(int ny) {
        y = ny;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void resetToOrigin() {
        x = 0;
        y = 0;
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj == null || !(obj instanceof Point2D)) {
            return false;
        }

        Point2D other = (Point2D) obj;
        return this.x == other.x && this.y == other.y;
    }

    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setX(5);
        a.setY(2);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");

        a.translate(-1, -1);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");

        a.resetToOrigin();
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");

        Point2D b = new Point2D();
        Point2D c = new Point2D();

        System.out.println(b.toString());
        System.out.println(c); //should auto call toString method
        System.out.println("Are b and c equal: " + b.equals(c));
    }
}
