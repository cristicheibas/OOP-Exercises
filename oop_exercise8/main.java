package oop_exercise8;
//adding a change for gerrit push
/**
 * Creates an objects of type Circle and Rectangle and displays their Area.
 * In abstract class GraphicObject add an abstract method area
 * which will be implemented by classes Circle and Rectangle.
 * Instantiate objects of type Circle and Rectangle and display their areas.
 * @author ccheibas
 */

public class Main {

	public static void main(String[] args) {
		Circle test_obj = new Circle(3.33f);
		Rectangle test_obj2 = new Rectangle(1.35f, 2.5f);

		System.out.println(String.format("The Area of the circle is " + "%.2f", test_obj.calculateArea())); //prints the area
		System.out.println(String.format("The Area of the rectangle is " + "%.2f", test_obj2.calculateArea())); //prints the area

	}
}

