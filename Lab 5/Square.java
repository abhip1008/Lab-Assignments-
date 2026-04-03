import java.awt.*;
public class Square extends Shape{

    private int sideLength;

    public Square(int x, int y, int sideLength) {
        super(x, y);
        setSideLength(sideLength);
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        if(sideLength > 0 ) {
            this.sideLength = sideLength;
        }
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.drawRect(getX(), getY(), sideLength, sideLength);
    }

    public static void main(String[] args) {
        Square s = new Square(5, 5, 10);
        System.out.println("Area: " + s.getArea());
    }
}
