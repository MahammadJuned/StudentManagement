import java.util.ArrayList;
import java.util.Scanner;
public class MainMenu {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<StudentPojo> student = new ArrayList<>();
	public static int marksValidation(int marks) {
		while(true) {
		if(marks < 0) {
			System.out.println("Marks cannot be negative. please re-enter the marks: ");
			   while (!sc.hasNextInt()) {
                   System.out.println("Invalid input. Please enter a valid number: ");
                   sc.next(); 
               }
			marks = sc.nextInt();
		} else return marks;
	  }
	}
	public static void addStudent() {
		System.out.println("Enter the ID of the student to add: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the name of the student: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the marks of the student: ");
		int marks = marksValidation(sc.nextInt());
		
		
		student.add(new StudentPojo(id,name,marks));
		System.out.println("Student added successfully....");
		
	}
	
	public static void getStudents() {
		if(student.isEmpty()) {
			System.out.println("There are no students to display...");
		} else {
			System.out.println("Students List:");
			for(StudentPojo students: student) {
				System.out.println(students);
			}
		}
	}
	
	public static void updateStudent() {
		System.out.println("Enter the id of the student to update: ");
		int id = sc.nextInt();
		sc.nextLine();
		for(StudentPojo students: student) {
			if(students.getId() == id) {
				System.out.println("Enter new name: ");
				String newName = sc.nextLine();
				System.out.println("Enter new marks: ");
				int newMarks = marksValidation(sc.nextInt());
				students.setName(newName);
				students.setMarks(newMarks);
				System.out.println("Student details updated successfully...");
				return;
			}
		}
		System.out.println("Student not found...");
	}
	
	public static void deleteStudent() {
		System.out.println("Enter the id of the student to delete: ");
		int id = sc.nextInt();
		sc.nextLine();
		for(StudentPojo students: student) {
			if(students.getId() == id) {
				student.remove(students);
				System.out.println("Student Deleted Successfully....");
				return;
			}
		}
		System.out.println("Student not found....");
		
	}
	public static void main(String[] args) {
		
		System.out.println("**********WELCOME TO STUDENT MANAGEMENT APP**********");
		while(true) {
		System.out.println("--------------------------------------------------");
		System.out.println("PRESS 1 TO ADD NEW STUDENT ");
		System.out.println("PRESS 2 TO VIEW ALL STUDENTDETAILS ");
		System.out.println("PRESS 3 TO UPDATE THE STUDENT ");
		System.out.println("PRESS 4 TO DELETE THE STUDENT ");
		System.out.println("PRESS 0 TO EXIT..");
		int option = sc.nextInt();
		switch(option) {
		case 0: System.out.println("Thank you.... Exiting the System");
				System.exit(0);
		case 1: addStudent();
				break;
		case 2: getStudents();
				break;
		case 3 :updateStudent();
				break;
		case 4: deleteStudent();
				break;
		default: System.out.println("Invalid Option...");
				 System.out.println("Please enter a valid option");
		}
		
		}
		
	}
}
