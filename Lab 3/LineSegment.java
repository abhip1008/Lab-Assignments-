import java.awt.*;

public class LineSegment {

    private Point2D start;
    private Point2D end;

    public LineSegment() {
        this.start = new Point2D();
        this.end = new Point2D();
    }

    public LineSegment(Point2D start, Point2D end) {
        if(start == null || end == null) {
            throw new IllegalArgumentException("Points cannot be null");
        }
        if(start.getX() < 0|| start.getY() < 0 || end.getX() < 0 || end.getY() < 0) {
            throw new IllegalArgumentException("Coordinates must be positive numbers");
        }

        this.start = new Point2D(start);
        this.end = new Point2D(end);
    }

    public LineSegment(LineSegment other) {
        this.start = new Point2D(other.start);
        this.end = new Point2D(other.end);
    }

    public Point2D getStart() {
        return new Point2D(start);
    }

    public Point2D getEnd() {
        return new Point2D(end);
    }

    public void setStartPoint(Point2D point) {
        if(point == null || point.getX() < 0 || point.getY() < 0) {
            throw new IllegalArgumentException();
        }
        this.start = new Point2D(point);
    }

    public void setEndPoint(Point2D point) {
        if(point == null || point.getX() < 0 || point.getY() < 0) {
            throw new IllegalArgumentException();
        }

        this.end = new Point2D(point);
    }

    @Override
    public String toString() {
        return "Line start: " + start + " end" + end;
    }

    @Override
    public boolean equals(Object other) {
        if(other == null) {
            return false;
        }
        if(this == other) {
            return true;
        }

        LineSegment that;
        try {
            that = (LineSegment) other;
        } catch(ClassCastException e) {
            return false;
        }

        return this.start.equals(that.start) && this.end.equals(that.end);
    }

    public double distance() {
        int dx = end.getY() - start.getX();
        int dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dx);
    }

    /**
     * 1) A privacy leak is when a method ia able to have direct access to data's
     * memory reference and letting them change data that is
     * supposed to be private
     *
     * 2) No, they return copies to the user and store them
     *
     * 3) In constructors if the references and not copies are stored
     */
}
