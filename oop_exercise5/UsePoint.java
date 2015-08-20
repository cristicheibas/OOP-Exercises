package oop_exercise5;

/**Creates two objects of class Point and displays their values
 * @author ccheibas
 * Add for class Point a constructor with 3 parameters (x, y, z) which will initialize values for data fields. 
 * Use the constructor in UsePoint. Do the same with a constructor which accepts 2 parameters (x and y).
 */

public class UsePoint {

	public static void main(String[] args) {
		Point test_obj = new Point(2,3,5);
		Point test_obj2 = new Point(11,12);
		
		
		System.out.println("X\tY\tZ\n"+test_obj.getx()+"\t"+test_obj.gety()+"\t"+test_obj.getz()); //prints the values after getting them
		System.out.println("X\tY\n"+test_obj2.getx()+"\t"+test_obj2.gety());
	}
}

