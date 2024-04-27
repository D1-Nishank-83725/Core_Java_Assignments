import java.util.Scanner;

public class SalariedEmployee extends Employee {
	
	private double weeklySalary;
	
	
	public SalariedEmployee() {
		System.out.println("Salaried Employee Constructor()");
	}
	

	public SalariedEmployee(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	
	//Accept Salaried Employee
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter your Fixed Weekly Salary: ");
		weeklySalary = sc.nextDouble();
	}


	
	//Display Salaried Employee
	
	@Override
	public String toString() {
		return "SalariedEmployee" +  super.toString() + "[WeeklySalary= " + weeklySalary + "]";
	}
	
	
	@Override
	public double calculateTotalSalary() {
		double sal = weeklySalary;
		return sal;
	}
	
	
	

	
	

}