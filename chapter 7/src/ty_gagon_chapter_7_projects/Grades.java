package ty_gagon_chapter_7_projects;

import java.util.*;

public class Grades {

	public Grades() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new Grades();
		
		int grade;
		Scanner input= new Scanner(System.in);
		 
		System.out.print("Enter a number grade: ");
		grade = input.nextInt();
		 
		if (grade >= 90) // grade is greater than or equal to 90
		{
		System.out.println("You made an A!");
		}
		else if (grade >= 80) // grade is greater than or equal to 80
		{
		System.out.println("You made a B!");
		}
		else if (grade >= 70) // grade is greater than or equal to 70
		{
		System.out.println("You made a C!");
		}
		else if (grade >= 60) // grade is greater than or equal to 60
		{
		System.out.println("You made a D!");
		}
		else
		{
		System.out.println("Study Harder!");
		}
		 
		input.close();
		
		
		
	}

}
