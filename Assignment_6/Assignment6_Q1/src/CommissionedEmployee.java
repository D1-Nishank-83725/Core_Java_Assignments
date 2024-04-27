import java.util.Scanner;

public class CommissionedEmployee extends Employee {
	
	private int grossSales;
	private double commissionRate;
	
	
	

	public CommissionedEmployee() {
		super();
	}



	public CommissionedEmployee(int grossSales, double commissionRate) {
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}



	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter the Number of Sales you did (Gross Sales): ");
		grossSales = sc.nextInt();
		System.out.println("Enter your Commission Rate: ");
		commissionRate = sc.nextDouble();
	}
	
	

	@Override
	public String toString() {
		return "CommissionedEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", toString()="
				+ super.toString() + "]";
	}



	@Override
	public double calculateTotalSalary() {
		double sal = grossSales*commissionRate;
		return sal;
	}



	public int getGrossSales() {
		return grossSales;
	}



	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}



	public double getCommissionRate() {
		return commissionRate;
	}



	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	

}
