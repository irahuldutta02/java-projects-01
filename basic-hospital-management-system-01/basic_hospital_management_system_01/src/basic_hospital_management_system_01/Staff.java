package basic_hospital_management_system_01;

import java.util.Scanner;

public class Staff {
	String sid, sname, desg, sex;
	int salary;

	void new_staff() {
		Scanner input = new Scanner(System.in);
		System.out.print("id:-");
		sid = input.nextLine();
		System.out.print("name:-");
		sname = input.nextLine();
		System.out.print("desigination:-");
		desg = input.nextLine();
		System.out.print("sex:-");
		sex = input.nextLine();
		System.out.print("salary:-");
		salary = input.nextInt();
	}

	void staff_info() {
		System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
	}
}
