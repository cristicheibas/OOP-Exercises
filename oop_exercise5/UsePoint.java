package oop_exercise5;

/**
 * Add for class Point a constructor with 3 parameters (x, y, z) which will initialize values for data fields. 
 * Use the constructor in UsePoint. Do the same with a constructor which accepts 2 parameters (x and y).
 * @author ccheibas
 */

public class UsePoint {

	public static void main(String[] args) {
		Point three_dimensional = new Point(2, 3, 5);
		Point two_dimensional = new Point(11, 12);
		
		//prints the values after getting them
		System.out.println("X\tY\tZ\n" + three_dimensional.getX() + "\t" + three_dimensional.getY() + "\t" + three_dimensional.getZ()); 
		System.out.println("X\tY\n" + two_dimensional.getX() + "\t" + two_dimensional.getY());
	}
}

