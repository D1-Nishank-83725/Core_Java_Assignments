import java.util.Scanner;

public class BaseSalariedEmployee extends CommissionedEmployee {
	
	private double baseSalary;
	
	
	public BaseSalariedEmployee() {
		
	}


	public BaseSalariedEmployee(int grossSales, double commissionRate, double baseSalary) {
		super(grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	


	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter your Base Salary: ");
		baseSalary = sc.nextDouble();
	}
	
	

	@Override
	public double calculateTotalSalary() {
		System.out.println("Base Salary Calculation: " + 0.1*baseSalary);
		double sal = 1.1*baseSalary + getGrossSales()*getCommissionRate();
		return sal;
	}



	@Override
	public String toString() {
		return "BaseSalariedEmployee [baseSalary=" + baseSalary + ", toString()=" + super.toString() + "]";
	}
	

	
	

}
