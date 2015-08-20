package oop_exercise1;

/** A class with a contructor and two methods returning a float
 * @author ccheibas
 *
 */
public class Square {
	private float sideLength;
	
	public Square(float a)
	{
		sideLength = a;
	}
	
	public float calculateArea(){
		return sideLength*sideLength;
	}
	
	public float calculatePerimeter(){
		return sideLength*4;
	}

}
