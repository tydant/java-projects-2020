package ty_gagon_chapter_7_projects;

import java.util.Scanner;
public class Example_s1_pass_if {

	public Example_s1_pass_if() {
	}
		public static void main(String[] args) {
			new Example_s1_pass_if();
			Scanner input = new Scanner (System.in);
			
			
			/*	
 * 
 * 
		double moviePrice = 12.00;
		 
		if (moviePrice > 10.00) System.out.println("I'll watch it at home instead");
		 
		if (moviePrice > 10.00)
		System.out.println("I'll watch it at home instead");
		 
		if (moviePrice > 10.00)
		System.out.println("I'll watch it at home instead");
		 
		System.out.println("All Done");
		
*/
		
			
			
			
		String user_name = "hello";
		int password = 123456;
		
		
		System.out.println("enter your user name");
		String x = input.nextLine();
		
		System.out.println("enter your pin number");
		int y = input.nextInt();
		
		if (x.contentEquals(user_name)&& y == password) {
				System.out.println("you got in");
		}
		else if (x.equals(user_name)) {
			System.out.println("thats not the right password");
		}
		else if (y == password) {
			System.out.println("thats not a good username");
		}
			
			else { 
				System.out.println("your not in");
		}
		
		System.out.println("thanks for trying the program");
		
		
		}
		
		
		
	}


