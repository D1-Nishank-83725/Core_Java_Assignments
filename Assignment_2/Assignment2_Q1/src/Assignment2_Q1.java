import java.util.Scanner;

public class Assignment2_Q1 {
	
	
	public static void main(String[] args) {
		
		while(true) {

			System.out.println("Credit Limit Calculator");
			
			
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Enter Allowed Credit Limit");
			int allowedCreditLimit = sc.nextInt();
			
			
			
			System.out.println("Enter total items charged");
			int charges = sc.nextInt();
			
			
			
			System.out.println("Enter total of all credits applied to the customer's account");
			int credit = sc.nextInt();
			
			
			
			System.out.println("Enter Pending Balance at the beginning of the month");
			int beginningBalance = sc.nextInt();
			
			
			
			
			int newBalance = beginningBalance + charges - credit;
//			System.out.println("Beginning Balance: " + beginningBalance);
//			System.out.println("Charges: " + charges);
//			System.out.println("Credit: " + credit);
			
			if(allowedCreditLimit >= newBalance) {
				System.out.println("New Balance for next Month: " + newBalance);
			}
			else {
				System.out.println("Credit Limit Exceeded");
			}
			
			
			System.out.println("Do you want to exit: 0: Exit     1: Continue");
			
			int ans = sc.nextInt();
            if (ans != 1) {
                break;
            }

			
		}
				
		
	}

}
