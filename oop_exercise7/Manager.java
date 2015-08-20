package oop_exercise7;

/** A subclass extending Employee
 * it also changes the hourly tariff when salary is requested
 * @author ccheibas
 *
 */
public class Manager extends Employee{
	private double tariffPerHour;
	
	Manager(int h) {
		super(h);
	}
	
	public double getSalary(){
		this.tariffPerHour = super.gettariffPerHour()*1.5;
		return this.tariffPerHour;
	}
}
