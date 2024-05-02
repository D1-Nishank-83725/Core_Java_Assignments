import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		Student[] arr = {
				new Student(4,"Anil",60),
				new Student(2,"Mukesh",30),
				new Student(5, "Sham",50),
				new Student(1,"Nikhil", 90),
				new Student(3, "Akash",70) 
				};

		System.out.println("Before Sorting: ");
		
		
		for(Student s: arr) {
			System.out.println(s.toString());
		}
		
		Arrays.sort(arr);
			
		System.out.println("After Sorting: ");
		
		
		for(Student s: arr) {
			System.out.println(s);
		}
		
		
	}

}
