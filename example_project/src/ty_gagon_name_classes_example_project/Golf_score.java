package ty_gagon_name_classes_example_project;

import java.util.*;

public class Golf_score {

	public Golf_score() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 

	
		  
		      String username;
		      int course1;
		      int course2;
		      int course3;
		      int average;

		      Scanner input = new Scanner(System.in);

		      System.out.print("Type your name and press Enter: ");
		      username = input.next();

		      System.out.print("Enter your round 1 score: ");
		      course1 = input.nextInt();
		      System.out.print("Enter your round 2 score: ");
		      course2 = input.nextInt();
		      System.out.print("Enter your round 3 score: ");
		      course3 = input.nextInt();

		      average = (course1 + course2 + course3) / 3;

		      System.out.println("");
		      System.out.println("Hello " + username);
		      System.out.println("Score for course 1: " + course1);
		      System.out.println("Score for course 2: " + course2);
		      System.out.println("Score for course 3: " + course3);
		      System.out.println("Average score: " + average);

		      input.close();

	}

}
