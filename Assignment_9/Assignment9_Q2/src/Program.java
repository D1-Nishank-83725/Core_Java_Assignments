import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = "";
		System.out.println("Enter the String to check for Palindrome: ");
		str = sc.next();
		
		String strrev = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			strrev += c;
		}
		
		System.out.println(str);
		System.out.println(strrev);
		
		
//		This step is really important, doing str == strrev will always ALWAYS compare the references
//		Therefore we have to use .equals method to compare the object values 
		
		if(str.equals(strrev)) {
			System.out.println("String - " + str + " is a PALINDROME");
		}
		else {
			System.out.println("String - " + str + " is NOT a PALINDROME");
		}

		
		
		
//		OLD LOGIC OF STRINGBUILDER
		
		
//		StringBuffer strbff = new StringBuffer("adad");
//		System.out.println(strbff);
//		System.out.println(strbff.reverse());

		
// 		Because the equals method is not overloaded in case of StringBuilder and StringBuffer
//		Therefore below will not work 
		
//		if(strbff.equals(strbff.reverse())) {
//			System.out.println("String - " + strbff + " is a PALINDROME");
//		}
//		else {
//			System.out.println("String - " + strbff + " is NOT a PALINDROME");
//		}

	}

}
