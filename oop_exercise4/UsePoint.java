package oop_exercise4;

/**Creates one object of type Point and displays its parameters
 * @author ccheibas
 * Implement a class Point with 3 private properties of type integer: x, y, z. 
 * Create setter and getter methods for these properties. 
 * Create a class UsePoint which contains main method, 
 * inside this method instantiate an object of type Point and display its properties.
 */
public class UsePoint {

	public static void main(String[] args) {
		Point test_obj = new Point();
		test_obj.setx(3);
		test_obj.sety(2);
		test_obj.setz(5);
		
		System.out.println("X\tY\tZ\n"+test_obj.getx()+"\t"+test_obj.gety()+"\t"+test_obj.getz()); //prints the values after getting them
	}
}

