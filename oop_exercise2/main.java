package oop_exercise2;
//adding a change for gerrit push
/**
 * Write a class Circle which has a field radius. For this class write two methods:
 * one for calculating area and one for calculating perimeter.
 * @author ccheibas
 */
public class Main {

	public static void main(String[] args) {
		Circle roundy = new Circle(2.22f);
		//prints the area
		System.out.println(String.format("The Area of the circle is " + "%.2f", roundy.calculateArea()));
		//prints the perimeter
		System.out.println(String.format("The Perimeter/Circumference of the circle is " + "%.2f", roundy.calculatePerimeter()));
	}
}

