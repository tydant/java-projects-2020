package ty_gagon_compus_chapter_8;

import java.util.Scanner;

public class Prime_numbers {

	public Prime_numbers() {
		
		
	
	
	}
	
	public static void print(Object o) {
		System.out.println(o.toString());
}
////////////////////////////////////////////////////////////////////
	public static void prime() {
		
		Scanner input = new Scanner(System.in);
		
		long temp;
		
		Boolean prime = true;
		
		print("Enter any number:");
		
		long num = input.nextInt();
		
		input.close();
		
		for(long i=2;i<=num/2;i++) 
		
		{
			temp=num%i;
					if(temp==0)
					{
						prime = false;
						break;
					}
			
			
		}
		if(prime) 
			print(num + " is a Prime Number");
		
		else 
			print(num + " is not a Prime Number");
	}
	public static void all_prime() {
		
	}
	
	//////////////////////////////////////////////////////////////////////////////
	
	public static void fizz_buzz() {
		
		Scanner input = new Scanner(System.in);
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
	}

}