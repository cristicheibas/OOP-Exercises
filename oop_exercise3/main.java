package oop_exercise3;

/**Creates two objects of class Student and calculates their average age
 * @author ccheibas
 *
 */
public class main {

	public static void main(String[] args) {
		Student test_obj = new Student();
		test_obj.setData("Johnny", 23);
		Student test_obj2 = new Student();
		test_obj2.setData("Cattie", 30);

		System.out.println("The average age of our students is: "+(test_obj.getAge()+test_obj2.getAge())/2);
	}
}

