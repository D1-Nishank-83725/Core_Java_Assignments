import java.util.Scanner;

public class Student {
	int rollno;
	String name;
	double marks;
	String course;
	
	
	public Student() {
		
	}


	public Student(int rollno, String name, double marks, String course) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	void accept() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Roll Number: ");
		rollno = sc.nextInt();

		System.out.println("Enter Student Name: ");
		name = sc.next();
//		sc.next();
		
		System.out.println("Enter Student Marks: ");
		marks = sc.nextDouble();
		
		System.out.println("Enter Student Course: ");
		course = sc.next();
//		sc.next();
		
		
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}
	
	
	
	
	

}
