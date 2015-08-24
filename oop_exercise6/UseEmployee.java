package oop_exercise6;
//adding a change for gerrit push
/**
 * 	Create a class Employee with:
 * 	private property tariffPerHour of type double and default value 5.5
 * 	public property hours of type int
 * 	method getSalary which returns tariffPerHour*hours
 * 	getter method for tariffPerHour
 * Create a class UseEmployee which contains main method, inside this method
 * instantiate an object of type Employee and display tariff per hour and salary of the employee.
 * @author ccheibas
 */

public class UseEmployee {

	public static void main(String[] args) {
		Employee engineer = new Employee(6);
		//print the values after getting them using the public methods
		System.out.println("Employee's TeriffPerHour is: " + engineer.gettariffPerHour()
		+ ". His total salary is: " + engineer.getSalary());
	}
}

