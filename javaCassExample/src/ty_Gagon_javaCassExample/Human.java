package ty_Gagon_javaCassExample;

import java.util.Scanner;

public class Human {
	
	
	String eyeColor;
	String hairColor;
	String hairLength;
	String height;
	String nat;
	String skinColor;
	int lbs;
	int iq;
	String firstname;
	String lastname;
	String midname;
	String gender;
	String age;
	
	
	
	public void intro() {
		System.out.println("Hello my name is " + firstname +" "+ midname +" "+ lastname);
		System.out.println("I am " + height +" "+ age +" and have " + hairColor + "hair " + eyeColor+ " eyes" );
			
	}
	
	
	
	public Human() {
		Scanner input = new Scanner(System.in);
		System.out.println("first name? ");
		firstname =input.nextLine();
		System.out.println("middle name? ");
		midname =input.nextLine();
		System.out.println("last name? ");
		lastname =input.nextLine();
		System.out.println("height? ");
		height =input.nextLine();
		System.out.println("age? ");
		age =input.nextLine();
		System.out.println("eye color? ");
		eyeColor =input.nextLine();
		
	
	}




}
