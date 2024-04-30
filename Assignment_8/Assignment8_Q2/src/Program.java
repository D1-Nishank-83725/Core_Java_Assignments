import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle();
//		System.out.println("X: " + c1.p1.getX()); 
		
		System.out.println("Enter the Diameter of the Circle: ");
		int diameter = sc.nextInt();
		c1.setDiameter(diameter);
		
		try 
		{			
			if(diameter < 0) 
			{
				throw new MyException("Diameter should be greater than 0");
			}
			else 
			{
				System.out.println("Diameter entered is greater than 0");
			}
			
		}
		
		catch (MyException e){
			e.printStackTrace();
		}

	}

}
