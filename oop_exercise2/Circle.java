package oop_exercise2;
//adding a change for gerrit push
/** 
 * A class with a contructor and two methods returning a float
 * @author ccheibas
 *
 */
public class Circle {
	private float radius;
	
	public Circle(float r)
	{
		radius = r;
	}
	
	public float calculateArea(){
		return radius*radius*(float)(Math.PI);
	}
	
	public float calculatePerimeter(){
		return 2*radius*(float)(Math.PI);
	}

}
