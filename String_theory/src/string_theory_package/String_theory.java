package string_theory_package;

import java.util.Calendar;

public class String_theory {
	

	public String_theory() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new String_theory ();
		
		String str1 = "Bibbety";
		String str2 = "Bobbety";
		String str3 = "Boo";
		String str4 = "BIBBETY";
		
		
		System.out.println("str1 equals str4: " + str1.equals(str4));
		
		System.out.println("str1 equals ignore case str4: " + str1.equalsIgnoreCase(str4));
		
		String replacestr1 = str1.replace('b', 'p');
		
		System.out.println(replacestr1);
		System.out.println("substr2: " + str2.substring(3));
		System.out.println("str3 upper case: " + str3.toUpperCase());
		
		System.out.println("the current time is: " + String.format("%tr", Calendar.getInstance()));
		
		System.out.println(str1 +str2);
		
		System.out.println("parseInt results: " + Integer.parseInt("5"));
		
		System.out.println("location of 'e' in str1: " + str1.indexOf('e'));
		
	}

}
