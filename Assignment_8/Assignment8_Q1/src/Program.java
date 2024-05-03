import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();
		try {			
			if(message.length() > 80) {				
				throw new ExceptionLineTooLong("String longer than 80 Characters");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("Scanner closed successfully");
			sc.close();
		}
	}

}
