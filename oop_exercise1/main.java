package oop_exercise1;
//adding a change for gerrit push
/** 
 *	Write a class Square which has a field sideLength. For this class write two methods: 
 *  one for calculating area and one for calculating perimeter.
 *  @author ccheibas
 */
public class Main {

	public static void main(String[] args) {
		Square squary = new Square(3.33f);
		//prints the area
		System.out.println(String.format("The Area of the square is " + "%.2f", squary.calculateArea()));
		//prints the perimeter
		System.out.println(String.format("The Perimeter of the square is " + "%.2f", squary.calculatePerimeter()));
	}
}

