package ty_gagon_name_classes_example_project;

import java.util.*;  

public class Conversations {

	public Conversations() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new Conversations();

		 Scanner input = new Scanner(System.in);
		
		 String name1 = "";
	      String noun1 = "";
	      String verb1 = "";
	      int int1 = 0;
	      double double1 = 0;
		
	      System.out.println("Hello we are going to create a short story.");
	      System.out.print("Please enter your name: ");
	      name1 = input.nextLine();

	      System.out.print("Please enter a noun: ");
	      noun1 = input.next();
		
	      			input.nextLine();
	      
	      System.out.print("Please  enter a verb: ");
	      verb1 = input.next(); 
	      
	      			input.nextLine(); 
	      
	      System.out.print("Please enter an integer: ");
	      	if (input.hasNextInt()) {
	      	 
	      		int1 = input.nextInt();
	      	}
	      	input.nextLine();
	      
	      	System.out.print("Please enter a real (decimal) number: ");
	        if (input.hasNextDouble()) {
	        	 double1 = input.nextDouble();
	        	 
	        }
	      
	        String story = "One day, " + name1 + " picked up a " + noun1 + " and decided to " + verb1 + " it.\n After getting arrested, spending " +  int1 + " days in jail, and paying a $" + double1 + " fine,\n name1 +  decided that was a bad idea!";

	        System.out.println("");
	        System.out.println(story);   
	
	}
	

}
