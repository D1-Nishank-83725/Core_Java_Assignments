import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		//Using StringBuilder
		
		
		StringBuilder str = new StringBuilder("Sunbeam");
		System.out.println("Original String: " + str);
		
		StringBuilder strrev = (str.reverse());
		System.out.println("Reversed String: " + strrev);
		
		
//		Using StringBuffer
//
//		StringBuffer str = new StringBuffer("SunbeamHinjewadi");
//		str.reverse();
		
		

	}

}
