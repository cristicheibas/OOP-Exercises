package oop_exercise1;

/** 
 * A class describing a Square contains tools for calculations
 * @author ccheibas
 */
public class Square {
	private float sideLength;
	
	public Square(float a) {
		sideLength = a;
	}
	
	public float calculateArea() {
		return sideLength * sideLength;
	}
	
	public float calculatePerimeter() {
		return sideLength * 4;
	}

}
