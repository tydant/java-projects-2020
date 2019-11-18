package cmdparams_ty_gagon;

import java.util.Scanner;

public class Params_Test_2 {

	public Params_Test_2() {
	
	}

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
	
		
		
		
		/*
		if (args.length > 0) {
		System.out.println("parameter 1: " + args[0]);
		
	}
	if (args.length > 1) {
		System.out.println("parameter 2: " + args[1]);
	
	}

	if (args.length > 2) {
		System.out.println("parameter 2: " + args[2]);
	}
   
   }


		int i =0;
	while ( i < args.length) {
System.out.println("parameter "+i+":" + args[i]);
 i++;
		
	}
	System.out.println("enter your name");	
	String name = input.nextLine();
	System.out.println("thanks");
	
	System.out.println("enter your age");
	int age = input.nextInt();
	System.out.println("thanks");
	
	System.out.println("enter your graduation year");
	int graduation_year = input.nextInt();
	System.out.println("thanks");
	
	System.out.println("enter your favorite food");
	String fav_food = input.nextLine();
	System.out.println("thanks");
	
	System.out.println("enter your phone number");
	String phone_number = input.nextLine();
	System.out.println("thanks");
	
	System.out.println("enter your social security number");
	int ssn = input.nextInt();
	System.out.println("thanks");
	
	System.out.println("enter your credit card number");
	String credit_card_number = input.nextLine();
	System.out.println("thanks");
	
	System.out.println("enter your last name");
	String lastname = input.nextLine();
	System.out.println("thanks");
	
	System.out.println("enter your bank balance");
	double bank_balance = input.nextDouble();
	System.out.println("thanks");
	
	System.out.println( "hello" + name);
		

	*/
		
		String first;
		String last;
		
		System.out.println("Enter your first and last name");
		first = input.next();
		last = input.next();
		String ssn = input.next();
		String bday = input.next();
		
		
		
		System.out.println("hello " + first + " " + last);


		System.out.println("         , - ~ D ~ - ,\r\n" + 
				"     , '               ' ,\r\n" + 
				"   ,                       ,\r\n" + 
				"  ,                         ,\r\n" + 
				" ,                           ,\r\n" + 
				" R             *             ,\r\n" + 
				" ,                           ,\r\n" + 
				"  ,                         ,\r\n" + 
				"   ,                       ,\r\n" + 
				"     ,                  , '\r\n" + 
				"       ' - , _ D _ ,  '");

	input.close();
	
	
  }

	
	
}
