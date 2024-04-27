import java.util.Scanner;

public abstract class Employee {
	
//	Fields 
	
	private int empid;
	private String firstName;
	private String lastName;
	
	
	//Parameterless Constructor
	
	public Employee() {
		System.out.println("Employee() Constructor");
	}
	
	
	
	
//	Parameterized Constructor 
	
	public Employee(int empid, String firstName, String lastName) {
		super();
		this.empid = empid;
		this.firstName = firstName;
		this.lastName = lastName;
	}




	// Accept Function 
	
	public void accept(Scanner sc) {
		System.out.println("Enter Employee ID: ");
		empid = sc.nextInt();
		System.out.println("Enter the First Name: ");
		firstName = sc.next();
		System.out.println("Enter the Last Name: ");
		lastName = sc.next();
		
	}
	
	
	
	//Display Employee using toString
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	public abstract double calculateTotalSalary();

}
