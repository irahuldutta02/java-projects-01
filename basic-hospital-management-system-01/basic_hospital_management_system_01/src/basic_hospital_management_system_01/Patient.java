package basic_hospital_management_system_01;

import java.util.Scanner;

public class Patient {
	String pid, pname, disease, sex, admit_status;
	int age;

	void new_patient() {
		Scanner input = new Scanner(System.in);
		System.out.print("id:-");
		pid = input.nextLine();
		System.out.print("name:-");
		pname = input.nextLine();
		System.out.print("disease:-");
		disease = input.nextLine();
		System.out.print("sex:-");
		sex = input.nextLine();
		System.out.print("admit_status:-");
		admit_status = input.nextLine();
		System.out.print("age:-");
		age = input.nextInt();
	}

	void patient_info() {
		System.out.println(
				pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t" + age);
	}
}
