package oop_exercise2;

/** Creates an object of type CIrcle and prints its Area and Circumference
 * @author ccheibas
 *
 */
public class main {

	public static void main(String[] args) {
		Circle test_obj = new Circle(2.22f);

		System.out.println(String.format("The Area of the circle is "+"%.2f",test_obj.calculateArea())); //prints the area
		System.out.println(String.format("The Perimeter/Circumference of the circle is "+"%.2f",test_obj.calculatePerimeter())); //prints the perimeter
	}
}

