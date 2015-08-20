package oop_exercise6;

/** A class with a public variable and a private one
 * a constructor and a getter for the private variable
 * @author ccheibas
 *
 */
public class Employee {
	private double tariffPerHour = 5.5;
	public int hours;

	Employee(int h){
		this.hours = h;
	}

	public double gettariffPerHour()
	{
		return this.tariffPerHour;
	}
}
