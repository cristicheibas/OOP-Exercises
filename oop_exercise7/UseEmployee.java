package oop_exercise7;

/**Creates 
 * @author ccheibas
 * Create a class Manager which inherits from Employee and has a method getSalary 
 * that will add 50 % bonus to Employee’s salary. 
 * Inside UseEmployee instantiate an object of type Manager, 
 * display tariff per hour and salary of the manager.
 */

public class UseEmployee {

	public static void main(String[] args) {
		Manager test_obj = new Manager(5);
		System.out.println("Manager's TeriffPerHour is: "+test_obj.gettariffPerHour()*1.5
		+". His total salary is: "+test_obj.getSalary()*test_obj.hours); //prints the values after getting them
	}
}

