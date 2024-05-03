import java.util.StringTokenizer;

public class Program {

	public static void main(String[] args) {
		
		
		String str = "The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class.";
		
//		System.out.println(str.length());


		String[] wordsarr = str.split(" ");
		

		System.out.println("Number of Words in the String: " + wordsarr.length);
		
		
//		Using Counter for the same 
		
//		int counter = 0;
//		for (String word : wordsarr) {
//			counter++;
//		}
//		
//		System.out.println("Number of Words in the String: " + counter);
		
		
 
		
//		Direct in-built Functions 
		StringTokenizer strt = new StringTokenizer(str, " ");
//		System.out.println(strt.countTokens());
		

	}

}
