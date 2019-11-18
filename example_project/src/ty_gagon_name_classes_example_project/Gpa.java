package ty_gagon_name_classes_example_project;

import java.util.Scanner;

public class Gpa {

	public Gpa() {
		
		
		Scanner input = new Scanner(System.in);
		double gpa = 0;
		
		
		
		
		System.out.println("Type in your gpa and presss enter: ");
		if (input.hasNextDouble()) {		
		gpa = input.nextDouble();
		}
		
		else {
			String error = input.next();
			System.out.println("Invalid entry: " + error);
		}
		
		input.hasNextLine();
		
		
		
		System.out.println("Your GPA is " + gpa);
		
		input.close();
	}

	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Gpa();

	}

}
