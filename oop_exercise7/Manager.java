package oop_exercise7;
//adding a change for gerrit push
/** 
 * A subclass extending Employee
 * counts its' own salary
 * @author ccheibas
 */
public class Manager extends Employee {
	
	Manager(int h) {
		super(h);
	}
	
	public double getSalary() {
		return super.getSalary() * 1.5;
	}
	
}
