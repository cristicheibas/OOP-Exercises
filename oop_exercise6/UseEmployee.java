package oop_exercise6;

/**Creates 
 * @author ccheibas
 * 	Create a class Employee with:
 * 	private property tariffPerHour of type double and default value 5.5
 * 	public property hours of type int
 * 	method getSalary which returns tariffPerHour*hours
 * 	getter method for tariffPerHour
 * Create a class UseEmployee which contains main method, inside this method 
 * instantiate an object of type Employee and display tariff per hour and salary of the employee.
 */

public class UseEmployee {

	public static void main(String[] args) {
		Employee test_obj = new Employee(6);
		System.out.println("Employee's TeriffPerHour is: "+test_obj.gettariffPerHour()
		+". His total salary is: "+test_obj.gettariffPerHour()*test_obj.hours); //prints the values after getting them
	}
}

