import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number of Employees you want: ");
		int noOfEmployeesYouWant = sc.nextInt();
		Employee[] employeeList = new Employee[noOfEmployeesYouWant];
		
		int counter = 0;
		
		while (true) {
			
			System.out.println("Type of Employee Calculation you want: ");
			System.out.println("0: Exit");
			System.out.println("1: Calculation for Salaried Employee: ");
			System.out.println("2: Calculation for Hourly Employee: ");
			System.out.println("3: Calculation for Commissioned Employee: ");
			System.out.println("4: Calculation for Base Salarired Commissioned Employee: ");
			System.out.println("5: Display all Employees: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 0:
				System.out.println("Thank you for using the Program");
				System.exit(0);
				break;
			
			case 1:
				if(counter < noOfEmployeesYouWant) {			
					employeeList[counter] = new SalariedEmployee();
					employeeList[counter].accept(sc);
					employeeList[counter].toString();
					System.out.println(employeeList[counter].calculateTotalSalary());
					counter++;
				}
				
				else {
					System.out.println("Employee List Full!");
				}
				break;
				
				
			case 2:
				if(counter < noOfEmployeesYouWant) {			
					employeeList[counter] = new HourlyEmployee();
					employeeList[counter].accept(sc);
					employeeList[counter].toString();
					System.out.println(employeeList[counter].calculateTotalSalary());
					counter++;
				}
				
				else {
					System.out.println("Employee List Full!");
				}
				break;
				
				
			case 3:
				if(counter < noOfEmployeesYouWant) {			
					employeeList[counter] = new CommissionedEmployee();
					employeeList[counter].accept(sc);
					employeeList[counter].toString();
					System.out.println(employeeList[counter].calculateTotalSalary());
					counter++;
				}
				
				else {
					System.out.println("Employee List Full!");
				}
				break;					
				
			case 4:
				if(counter < noOfEmployeesYouWant) {					
					employeeList[counter] = new BaseSalariedEmployee();
					employeeList[counter].accept(sc);
					employeeList[counter].toString();
					System.out.println(employeeList[counter].calculateTotalSalary());
					counter++;
				}
				else {
					System.out.println("Employee List Full!");
				}
				break;	
				
				
			case 5:
				for(Employee emp : employeeList) {
					if(emp != null) {						
						System.out.println(emp.toString());
					}
				}
				break;
				
			}
			
			
			
			System.out.println("What do you want to do:        0: Exit          1: Continue");
			int contornot = sc.nextInt();
			
			if(contornot == 0) {
				break;
			}
		}

	}

}
