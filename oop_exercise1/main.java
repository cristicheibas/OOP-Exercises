package oop_exercise1;


/** Creates an object of type Square and prints its Area and Perimeter
 * @author ccheibas
 *
 */
public class main {

	public static void main(String[] args) {
		Square test_obj = new Square(3.33f);

		System.out.println(String.format("The Area of the square is "+"%.2f",test_obj.calculateArea())); //prints the area
		System.out.println(String.format("The Perimeter of the square is "+"%.2f",test_obj.calculatePerimeter())); //prints the perimeter
	}
}

