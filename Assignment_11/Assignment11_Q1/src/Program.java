import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

//		Collection<Student> stulist = new ArrayList<Student>();

//		stulist.add(new Student(4, "Nishank", 60, "DAC"));
//		stulist.add(new Student(3, "Atharva", 70, "DMC"));
//		stulist.add(new Student(5, "Yogesh", 40, "DBDA"));
//		stulist.add(new Student(2, "Vaishnavi", 90, "DITISS"));
//		stulist.add(new Student(1, "Tasneem", 100, "DAC"));
//		stulist.add(new Student(6, "Samantha", 85, "DITISS"));
//		stulist.add(new Student(8, "Rahul", 75, "DBDA"));
//		stulist.add(new Student(10, "Priya", 95, "DAC"));
//		stulist.add(new Student(9, "Kiran", 65, "DMC"));
//		stulist.add(new Student(7, "Amit", 55, "DBDA"));

//		for(Student s: stulist) {
//			System.out.println(s);
//		}

		Student[] studentarr = new Student[3];

		class StudentRollnoComparator implements Comparator<Student> {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.rollno - o2.rollno;
			}

		}

		class StudentNameComparator implements Comparator<Student> {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}

		}

		class StudentMarksDescComparator implements Comparator<Student> {

			@Override
			public int compare(Student o1, Student o2) {
				return -Double.compare(o1.marks, o2.marks);
			}

		}

		class StudentCourseComparator implements Comparator<Student> {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.course.compareTo(o2.course);
			}

		}

		StudentRollnoComparator srnc = new StudentRollnoComparator();
		StudentNameComparator snc = new StudentNameComparator();
		StudentMarksDescComparator smdc = new StudentMarksDescComparator();
		StudentCourseComparator scc = new StudentCourseComparator();

		Scanner sc = new Scanner(System.in);
		int counter = 0;

		while (true) {

			int choice;

			System.out.println("0: Exit");
			System.out.println("1. Add Student");
			System.out.println("2. Display all students sorted on roll number:");
			System.out.println("3. Display all students sorted on name:");
			System.out.println("4. Display all students sorted on marks in descending order:");
			System.out.println("5. Display all students sorted on course:");

			choice = sc.nextInt();

			switch (choice) {

			case 0:
				System.exit(0);
				break;

			case 1:
				if (counter < studentarr.length) {
					studentarr[counter] = new Student();
					studentarr[counter].accept();
					counter++;
					System.out.println("Student Successfully Added!");
				} else {
					System.out.println("Array Full!");
				}
				break;

			case 2:
				System.out.println("All students sorted on roll number:");
				Arrays.sort(studentarr, 0, counter, srnc);

				for (Student s : studentarr) {
//					if (s != null) {
						System.out.println(s);
//					}
				}

				System.out.println();
				break;

			case 3:
				System.out.println("All students sorted on name:");
				Arrays.sort(studentarr, 0, counter, snc);

				for (Student s : studentarr) {
					if (s != null) {
						System.out.println(s);
					}
				}

				System.out.println();
				break;

			case 4:
				System.out.println("All students sorted on marks in descending order:");
				Arrays.sort(studentarr, 0, counter, smdc);

				for (Student s : studentarr) {
					if (s != null) {
						System.out.println(s);
					}
				}

				System.out.println();
				break;

			case 5:
				System.out.println("All students sorted on course:");
				Arrays.sort(studentarr, 0, counter, scc);

				for (Student s : studentarr) {
					if (s != null) {
						System.out.println(s);
					}
				}
				System.out.println();
				break;

			default:
				System.out.println("Invalid Choice!");
				break;
			}

		}

	}

}
