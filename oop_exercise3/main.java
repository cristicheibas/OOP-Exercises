package oop_exercise3;

/** 
 * Declare a class Student with the following properties: name, age and 2 methods setData and getAge. 
 * Create 2 objects of type Student and display the average age. 
 * Method setData should have 2 parameters which will be used to give values to Name and Age.
 * @author ccheibas
 */
public class Main {

	public static void main(String[] args) {
		
		Student male = new Student();
		male.setData("Johnny", 23);
		Student female = new Student();
		female.setData("Cattie", 30);

		System.out.println("The average age of our students is: " + (male.getAge() + female.getAge()) / 2);
	}
}

