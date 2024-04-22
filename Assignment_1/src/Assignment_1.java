import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Enter a Number of type double");
		if(!sc.hasNextDouble()) {
			System.out.println("Invalid Double Number!");
			System.exit(0);
		}
		
		num1 = sc.nextDouble();
		

		System.out.println("Enter another Number of type double");
		if(!sc.hasNextDouble()) {
			System.out.println("Invalid Double Number!");
			System.exit(0);
		}
		
		num2 = sc.nextDouble();
		
		double avg = (num1 + num2)/2;
		System.out.println("Average of the Numbers is: " + avg);
		
		System.exit(0);

	}

}