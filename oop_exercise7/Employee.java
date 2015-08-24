package oop_exercise7;
//adding a change for gerrit push
/**
 * The class describing the earnings of an employee
 * @author ccheibas
 *
 */
public class Employee {
	private double tariffPerHour = 5.5;
	public int hours;

	Employee(int h) {
		this.hours = h;
	}

	public double gettariffPerHour() {
		return this.tariffPerHour;
	}

	public double getSalary() {
		return this.tariffPerHour * this.hours;
	}
}
