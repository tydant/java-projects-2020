package dog_house;

import java.util.Scanner;

public class Home {

	public Home() {
		
	}
	public static void enter() {
		String enter;
		Scanner input = new Scanner(System.in);
		
		enter = input.nextLine();
	}

	public static void main(String[] args) {
		
		 Dog bobDog = new Dog();
		 
		 String name = bobDog.getName();
		 
		 System.out.println("A day in the life of my dog " + name);
			
		 System.out.println(" press enter to start the day");
		 enter();
		 bobDog.wakeUp();	
		 bobDog.feed();		
		 bobDog.hear("ding-dong");		 
		 bobDog.hear("ding-dong");		
		 bobDog.hear(name);		
		 bobDog.hear("ding-dong");		
		 bobDog.hear("ding-dong");		 
	     bobDog.feed();	    
	     bobDog.feed();	    
	     
	     System.out.println("\nNight-time...");
	     bobDog.sleep();
	     bobDog.feed();
	     bobDog.hear("ding-dong");
	     bobDog.wakeUp();
	    
	     System.out.println("\nAnother day...");
	     bobDog.hear("ding-dong");
	     bobDog.feed();
	     bobDog.feed();
	     bobDog.feed();
	}

}
