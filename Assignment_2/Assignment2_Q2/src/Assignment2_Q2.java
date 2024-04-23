import java.util.Scanner;

public class Assignment2_Q2 {

	public static void main(String[] args) {
		
		while (true) {
			

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the total Miles driven per Day: ");
			int totalMilesDrivenPerDay = sc.nextInt();
			

			System.out.println("Enter the Cost per gallon of Gasoline: ");
			int costPerGallonOfGasoline = sc.nextInt();	
			
			
			System.out.println("Enter Average Miles per Gallon: ");
			int avgMilesPerGallon = sc.nextInt();	
			
			

			System.out.println("Enter Parking Fees per Day: ");
			int parkingFeesPerDay = sc.nextInt();	
			

			System.out.println("Enter the Amount of Toll Fees you pay: ");
			int tollsPerDay = sc.nextInt();	
			
			

			
			int perDayPetrol = (totalMilesDrivenPerDay*costPerGallonOfGasoline)/avgMilesPerGallon;
			
			int totalCost = perDayPetrol + parkingFeesPerDay + tollsPerDay;
			
			System.out.println("You can save a total of "+ totalCost + " Dollars/Day, if you don't use a car");
			
			
			System.out.println("Do you want to exit: 0: Exit     1: Continue");
			
			int ans = sc.nextInt();	
            if (ans != 1) {
                break;
            }
			
		}
		
	}

}





