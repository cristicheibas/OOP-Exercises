package oop_exercise7;
//adding a change for gerrit push
/**
 * Create a class Manager which inherits from Employee and has a method getSalary
 * that will add 50 % bonus to Employees salary.
 * Inside UseEmployee instantiate an object of type Manager,
 * display tariff per hour and salary of the manager.
 * @author ccheibas
 */

public class UseEmployee {

	public static void main(String[] args) {
		Manager manager = new Manager(5);
		//prints the values after getting them
		System.out.println("Manager's TeriffPerHour is: " + manager.gettariffPerHour()
		+ ". His total salary is: " + manager.getSalary());
	}
}

