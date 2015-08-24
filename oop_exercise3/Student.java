package oop_exercise3;

/** 
 * A class describing a student's name and age
 * @author ccheibas
 */

public class Student {
	private int age;
	private String name; 

	public void setData (String n, int a) {
		this.name = n;
		this.age = a;
	}


	public float getAge() {
		return this.age;
	}


}
