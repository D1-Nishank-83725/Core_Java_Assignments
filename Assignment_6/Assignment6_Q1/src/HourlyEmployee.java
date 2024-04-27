import java.util.Scanner;

public class HourlyEmployee extends Employee{
	
	private int hrs;
	private double wage;
	
	
	




	public HourlyEmployee(double wage) {
		this.wage = wage;
	}
	
	
	
	
	public HourlyEmployee() {
	}




	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter the Number of hours you work in total ");
		hrs = sc.nextInt();
		System.out.println("Enter your Hourly Salary ");
		wage = sc.nextDouble();
	}

	
	
	@Override
	public String toString() {
		return "HourlyEmployee [hrs=" + hrs + ", wage=" + wage + super.toString() + "]";
	}
	
	
	@Override
	public double calculateTotalSalary() {
		if(hrs > 0 && hrs < 40) {
			return wage*hrs;
		}
		else {
			return wage*40 + wage*(hrs-40)*1.5;
		}
	}
	
	
	

}
