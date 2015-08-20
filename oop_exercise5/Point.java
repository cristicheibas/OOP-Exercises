package oop_exercise5;

/** A class with setters and getters for all of its' variables
 *  and two different constructors
 * @author ccheibas
 *
 */

public class Point {
	private int x;
	private int y;
	private int z;
	
	Point(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void setx(int var)
	{
		this.x = var;
	}
	
	public void sety(int var)
	{
		this.y = var;
	}

	public void setz(int var)
	{
		this.z = var;
	}

	public int getx()
	{
		return this.x;
	}
	
	public int gety()
	{
		return this.y;
	}
	
	public int getz()
	{
		return this.z;
	}


}
