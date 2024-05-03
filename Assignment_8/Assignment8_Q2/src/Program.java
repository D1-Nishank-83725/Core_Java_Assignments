import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle();
//		System.out.println("X: " + c1.p1.getX()); 
		try 
		{	
		System.out.println("Enter the Diameter of the Circle: ");
		int diameter = sc.nextInt();
		c1.setDiameter(diameter);
		
				
			if(diameter < 0) 
			{
				throw new MyException("Diameter should be greater than 0");
			}
		 System.out.println(c1.toString());
			
			
			
		}
		
		catch (MyException e){
			e.printStackTrace();
		}

	}

}
