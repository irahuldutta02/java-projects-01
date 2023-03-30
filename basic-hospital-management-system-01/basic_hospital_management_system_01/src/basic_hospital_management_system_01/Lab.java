package basic_hospital_management_system_01;

import java.util.Scanner;

public class Lab {
	String fecility;
	int lab_cost;

	void new_feci() {
		Scanner input = new Scanner(System.in);
		System.out.print("fecility:-");
		fecility = input.nextLine();
		System.out.print("cost:-");
		lab_cost = input.nextInt();
	}

	void feci_list() {
		System.out.println(fecility + "\t\t" + lab_cost);
	}
}
