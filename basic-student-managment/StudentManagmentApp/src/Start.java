import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Student Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Press 1  to Add Student.");
			System.out.println("Press 2  to Delete Student.");
			System.out.println("Press 3  to Display Student.");
			System.out.println("Press 4  to Exit...");
			System.out.println("|-----------------------------------------------|");
			System.out.print("Input : ");
			int c = Integer.parseInt(br.readLine());

			if (c == 1) {
				// add student
				System.out.print("Enter user name : ");
				String name = br.readLine();

				System.out.print("Enter user phone : ");
				String phone = br.readLine();

				System.out.print("Enter user city : ");
				String city = br.readLine();

				// create student object to store student
				Student st = new Student(name, phone, city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if (answer) {
					System.out.println("Student added succesfully...");
					System.out.println(st);
					System.out.println("|-----------------------------------------------|");
				} else {
					System.out.println("Something went wrong! try again...");
					System.out.println("|-----------------------------------------------|");
				}
				
			} else if (c == 2) {
				// delete student
				System.out.print("Enter Student Id to delete : ");
				int userId = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudent(userId);
				if (f) {
					System.out.println("Student deleted succesfully...");
					System.out.println("|-----------------------------------------------|");
				} else {
					System.out.println("Something went wrong! try again...");
					System.out.println("|-----------------------------------------------|");
				}
			} else if (c == 3) {
				// Display student
				StudentDao.showAllStudent();
			} else if (c == 4) {
				// exit
				break;
			} else {
				System.out.println("invalid input! Try again...");
				System.out.println("|-----------------------------------------------|");

			}

		}
		System.out.println("Thank you for using my application \nSee you soon...bye bye.");
		System.out.println("|-----------------------------------------------|");
	}

}
