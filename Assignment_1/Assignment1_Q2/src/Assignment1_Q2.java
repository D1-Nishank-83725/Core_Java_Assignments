import java.util.Scanner;

public class Assignment1_Q2 {

	public static void main(String[] args) {
		
		int totalbill = 0;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			int price1 = 100;
			int price2 = 200;
			
			System.out.println("1.  Dosa                - 100");
			System.out.println("2.  Fried Rice          - 200");
			System.out.println("3.  Thai Curry          - 100");
			System.out.println("4.  Butter Chicken      - 200");
			System.out.println("5.  Naan                - 100");
			System.out.println("6.  Paneer Tikka Masala - 200");
			System.out.println("7.  Pizza               - 100");
			System.out.println("8.  Pasta               - 200");
			System.out.println("9.  Mac and Cheese      - 100");
			System.out.println("10. Generate Bill            ");
			
			
			System.out.println("Enter the food Number from Menu you want");
			
			int choice = sc.nextInt();
			
			if(choice == 10) {
				System.out.println("Total Bill: " + totalbill);
                System.exit(0);
            
			}
			

			System.out.println("Enter the Quantity you want for the food");

			int quantity = sc.nextInt();
			
			switch(choice) {
			case 1:
				totalbill = totalbill + price1*quantity;
				System.out.println("Dosa successfully added");
                break;
            case 2:
				totalbill = totalbill + price2*quantity;
				System.out.println("Fried Rice successfully added");
                break;
            case 3:
				totalbill = totalbill + price1*quantity;
				System.out.println("Thai Curry successfully added");
                break;
            case 4:
				totalbill = totalbill + price2*quantity;
				System.out.println("Butter Chicken successfully added");
                break;
            case 5:
				totalbill = totalbill + price1*quantity;
				System.out.println("Naan successfully added");
                break;
            case 6:
				totalbill = totalbill + price2*quantity;
				System.out.println("PTM successfully added");
                break;
            case 7:
				totalbill = totalbill + price1*quantity;
				System.out.println("Pizza successfully added");
                break;
            case 8:
				totalbill = totalbill + price2*quantity;
				System.out.println("Pasta successfully added");
                break;
            case 9:
				totalbill = totalbill + price1*quantity;
				System.out.println("Mac and Cheese successfully added");
                break;
            case 10:
				System.out.println("Total Bill: " + totalbill);
                System.exit(0);
            
            default:
                System.out.println("Invalid Number Entered");
			}
			
		}

	}

}


