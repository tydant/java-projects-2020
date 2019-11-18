package ty_gagon_name_classes_example_project;
import java.util.Scanner;

public class Mad_libs {

	public Mad_libs() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new Mad_libs();
		
		Scanner input =new Scanner(System.in);
		
		int i =0;
	while ( i < args.length) {
System.out.println("parameter "+i+":" + args[i]);
 i++;
		
	}
		
	 System.out.print("Please enter your name: ");
     String name1 = input.nextLine();
	
     System.out.print("Please enter an integer: ");
     if (input.hasNextInt())
    	 
     System.out.print("Please enter a real (decimal) number: ");
     if (input.hasNextDouble()) 
	
	
    	 
		
		System.out.println("enter an adjective");	
		String word1 = input.nextLine();
		System.out.println("thanks");
		
		System.out.println("enter a noun");	
		String word2 = input.nextLine();
		System.out.println("thanks");
		
		System.out.println("enter a verb past tense");	
		String word3 = input.nextLine();
		System.out.println("thanks");
		
		System.out.println("enter an adverb");	
		String word4 = input.nextLine();
		System.out.println("thanks");
		
		System.out.println("enter an adjective");	
		String word5 = input.nextLine();
		System.out.println("thanks");
		
		System.out.println("enter a noun");	
		String word6 = input.nextLine();
		System.out.println("thanks");
		
		System.out.println("enter a noun");	
		String word7 = input.nextLine();
		System.out.println("thanks");
		
		System.out.println("enter an adjective");	
		String word8 = input.nextLine();
		System.out.println("thanks");
		
		System.out.println("enter a verb");	
		String word9 = input.nextLine();
		System.out.println("thanks");
		
		System.out.println("enter an adverb");	
		String word10 = input.nextLine();
		System.out.println("thanks");
		
		System.out.println("enter a verb past tense");	
		String word11 = input.nextLine();
		System.out.println("thanks");
		
		System.out.println("enter an adjective");	
		String word12 = input.nextLine();
		System.out.println("thanks");
	
		String result000 = String.format(
				"Today I went to the zoo. I saw a %1$s \r\n" + 
				"%2$s jumping up and down in its tree. He\r\n" + 
				"%3$s %4$s through\r\n" + 
				"the large tunnel that led to its %5$s\r\n" + 
				"%6$s. I got some peanuts and passed them\r\n" + 
				"through the cage to a gigantic gray %7$s\r\n" + 
				"towering above my head. Feeding that animal made me\r\n" + 
				"hungry. I went to get a %8$s scoop of ice\r\n" + 
				"cream. It filled my stomach. Afterwards I had to\r\n" + 
				"%9$s %10$s to catch our bus. When\r\n" + 
				"I got home I %11$s my mom for a\r\n" + 
				"%12$s day at the zoo. ", word1 , word2 , word3 
				, word4 , word5 , word6 , word7 , word8 , word9 , word10 , word11 , word12 );
		
		System.out.println(result000);
		
		
		 
		
		
		
		
		input.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
