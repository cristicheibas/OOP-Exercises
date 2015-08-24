package oop_exercise4;

/**
 * Implement a class Point with 3 private properties of type integer: x, y, z. 
 * Create setter and getter methods for these properties. 
 * Create a class UsePoint which contains main method, 
 * inside this method instantiate an object of type Point and display its properties.
 * @author ccheibas
 */
public class UsePoint {

	public static void main(String[] args) {
		Point three_dimensional = new Point();
		
		three_dimensional.setX(3);
		three_dimensional.setY(2);
		three_dimensional.setZ(5);
		
		//prints the values after getting them
		System.out.println("X\tY\tZ\n" + three_dimensional.getX() + "\t" + three_dimensional.getY() + "\t" + three_dimensional.getZ()); 	
	}
}

