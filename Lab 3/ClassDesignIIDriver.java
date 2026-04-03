
import java.awt.Color;

/*
 * Lab2 Driver:   ClassDesignIIDriver.java
 * Author: Abhi Purohit
 * 
 * Purpose: This is a test file to be included in the same (working) directory as your 
 * new class definitions.  Once you define a class (say, the Date class), uncomment the driver code
 * associated with that class to test it.  Match your output with the provided output, and pay 
 * particular attention to each new technique as we make use of it (Overloading, Constructors, Copy 
 * Constructors, Access Modifiers, Class Invariants, etc.)
 * 
 */


public class ClassDesignIIDriver {    
    
    public static void main(String[] args) {
        //uncomment the desired Driver or Demo below and run this code to test your progress
        shapeDriver();
        lineSegmentDriver();
        immutableFractionDriver();
        customMathDriver();
    }

    private static void shapeDriver() {
        System.out.println("uncomment the code to use the shapeDriver");

        Shape a = new Shape();
        Shape b = new Shape(10, 10, Color.DARK_GRAY);
        
        a.setX(120);
        b.setY(140);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }
    
    public static void lineSegmentDriver() {
        System.out.println("uncomment the code to use the lineSegmentDriver");
        LineSegment a = new LineSegment();
        LineSegment b = new LineSegment(new Point2D(1,1), new Point2D(2,2));
        LineSegment c = new LineSegment(b);
        
        a.setStartPoint(new Point2D(3, 3));
        a.setEndPoint(new Point2D(4, 4));
        
        System.out.println("Line a: " + a.toString());
        System.out.println("Line b: " + b.toString());
        System.out.println("Line c: " + c.toString());
        
        System.out.println("Line b's distance between points: " + b.distance());
        
        System.out.println("Does a equal b? " + a.equals(b));
        System.out.println("Does a equal c? " + a.equals(c));
        System.out.println("Does b equal c? " + b.equals(c));

    }
    
    
    public static void immutableFractionDriver() {
        System.out.println("Uncomment the code to use the immutableFractionDriver");
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(3, 4);
        Fraction c = new Fraction(b);
    
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        
        // fix the following 2 errors
        System.out.println("a.num:" + a.numerator);
        System.out.println("b.denom:" + b.denominator);
        
        
        // which of the following code is correct to change the fraction a?
        a.add(b);
        a = a.add(b);
        
        System.out.println("a: " +a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("b.equals(c): " + b.equals(c));

        
    }

    private static void customMathDriver() {
        System.out.println("uncomment the code to use the customMathDriver");

        double a = CustomMath.PI;
        double b = CustomMath.E;
        double c = a + b;
        
        System.out.println("The larger of the two is " + CustomMath.max(10, 20));
        System.out.println("And the larger of the two is " + CustomMath.max(10.34, 10.31));
        System.out.println("2^8 is " + CustomMath.power(2, 8));

    }
}