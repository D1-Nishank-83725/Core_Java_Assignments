import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		
		while (true) {

			Scanner sc = new Scanner(System.in);
			
			Invoice i1 = new Invoice();
			
			
			i1.accept();
			i1.display();
			
			System.out.println("Do you want to 0: Exit        1: Continue ");
			
			int check = sc.nextInt();
			
			if(check == 0) {
				break;
			}
			
		}

	}
	
}
