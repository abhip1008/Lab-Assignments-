//Lab 2 - CSSSKL 143 
//Author: Abhi Purohit

public class ShapesPictureDriver {

	//precondition: assumes {Square and Picture} all exist in the same working directory
	//so complete those classes first and then test on this driver file

	public static void main(String[] args) {
		Square firstSquare = new Square();
		Square secondSquare = new Square(10, 20);

		firstSquare.setX(3);
		firstSquare.setY(4);

		System.out.println( "Drawing the first square : " + firstSquare.toString());

		secondSquare.setSideLength(30);

		System.out.println( "Second square has area : " + secondSquare.getArea());
		System.out.println("First square has area : " + firstSquare.getArea());
		System.out.println("Are the squares equal? " + firstSquare.equals(secondSquare));

		// Write your own Circle Tests for 2 circles (test for area, equals, toString, constructors, setters)
		Circle firstCircle = new Circle();
		Circle secondCircle = new Circle(5, 6, 10);

		firstCircle.setX(1);
		firstCircle.setY(2);
		firstCircle.setRadius(5);

		System.out.println("Drawing the first circle: " + firstCircle.toString());
		System.out.println("First circle area: " + firstCircle.getArea());
		System.out.println("Second circle area: " + secondCircle.getArea());
		System.out.println("Are the circles equal? " + firstCircle.equals(secondCircle));
		System.out.println();


		// Create more squares and circles to test the ObjectList class
		// Create 3 more squares and circles
		Square thirdSquare = new Square(1, 1, 4);
		Square fourthSquare = new Square(2, 2, 6);
		Square fifthSquare = new Square(3, 3, 8);

		Circle thirdCircle = new Circle(2, 3, 7);
		Circle fourthCircle = new Circle(4, 5, 9);
		Circle fifthCircle = new Circle(6, 7, 11);



		//now, lets see the bigger picture
		ObjectList picture = new ObjectList();

		picture.add( firstSquare );
		picture.add( secondSquare );
		picture.add( firstCircle );
		picture.add( secondCircle );

		// Add the remaining 3squares and circles to the picture
		picture.add(thirdSquare);
		picture.add(fourthSquare);
		picture.add(firstSquare);
		picture.add(thirdCircle);
		picture.add(fourthCircle);
		picture.add(fifthCircle);

		System.out.println( "Drawing a Picture using ObjectList with Circles and Squares:\n" );

		System.out.println(picture.toString());


	}

}
