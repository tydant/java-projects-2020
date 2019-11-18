package ty_gagon_chapter_7_projects;

import static java.lang.System.out;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class Guess_my_number {

	public Guess_my_number() {
		
		out.println("hello");
		
		Scanner input = new Scanner(System.in);
		int option = 0;
		while (option != 10){
			print("welcome to guess my number game");
			print("please select the loop style you would like to use");
			print("press 1 for a For loop");
			print("press 2 for a While loop");
			print("press 3 for a Do loop");
			print("press 4 to flip a coin");
			print("press 5 roll some dice");
			print("press 6 computer guess do loop");
			print("press 7 Quit");
		option = input.nextInt();
		switch(option) {
		case 1:
			print("for loop");
			for_loop_guess(input);
			break;
		case 2:
			print("While loop");
			while_loop_guess(input);
			break;
		case 3:
			print("Do loop");
			do_loop(input);
			break;
		case 4:
			print("coin");
			flip_coin();
			break;
		case 5:
			print("dice");
			roll_dice();
			break;
		case 6:
			print("Do loop computer guess");
			do_loop_computer(input);
			break;
		case 7:
			print("Quit");
			option = 10;
			break;
			default:
				System.out.println ("thats not an option");
		}
		}	
		
	}
////////////////////////////////////////////////////////////////////////////////

	public static void print(Object o) {
		System.out.println(o.toString());
	}
///////////////////////   coin flip      ////////////////////////////////////////
	public void flip_coin() {
		int coin = ThreadLocalRandom.current().nextInt(1,3);
		if (coin == 1) {
			print("Heads");
		}
		else {
			print("Tails");
		}
	}
	
/////////////////////////////   dice roll  ///////////////////////////////////////
	
	public void roll_dice( ) {
		Random generator = new Random();
		int die1;
		int die2;
		die1 = generator.nextInt(6)+1;
		die2 = generator.nextInt(6)+1;
		print(die1);
		print(die2);
	}
	
	/////////////////////////   while loop  /////////////////////////////////////
	public void while_loop_guess(Scanner input) {
		
		print("pick a number between 1 and 10");
		int guess = input.nextInt();
		int trys =0;
		int max_try = 1;
		
		int r_num =(int) (Math.random()*10)+1;
		while(guess != r_num && trys <= max_try) {
			print("Nope try again");
			trys++;
			print("pick a number between 1 and 10");
		    guess = input.nextInt();
		  
		}
		if (guess == r_num) {
			print("you got it ");
		}
		else {
			print("you are really bad at this");
			print ("the number was " + r_num + "\n");
		}
	}
	/////////////////////////////for loop//////////////////////////////////////////
	
	public void for_loop_guess(Scanner input) {
		print("pick a number between 1 and 10");
		int guess = input.nextInt();
		int trys =0;
		int max_try = 1;
		int r_num =(int) (Math.random()*10)+1;
		
		for (int i = 0 ; i<2 && guess != r_num; i++) {
			print("Nope try again");
			print("pick a number between 1 and 10");
			guess = input.nextInt();
		
		}
		if (guess == r_num) {
			print("you got it ");
		}
		else {
			print("you are really bad at this");
			print ("the number was " + r_num + "\n");
		}
	}
	
	/////////////////////////////////////////////////////////////
public void do_loop(Scanner input) {
		
		print("pick a number between 1 and 10");
		int guess = input.nextInt();
		int trys =0;
		int max_try = 1;
		
		int r_num =(int) (Math.random()*10)+1;
		
		do {
			
			print("Nope try again");
			trys++;
			print("pick a number between 1 and 10");
		    guess = input.nextInt();
			
		}while (guess != r_num && trys <= max_try);

		if (guess == r_num) {
			print("you got it ");
		}
		else {
			print("you are really bad at this");
			print ("the number was " + r_num + "\n");
		}
		
		
	}

//////////////////////////////////////////////////////////////////////


public void do_loop_computer(Scanner input) {
	
	
	Scanner in = new Scanner(System.in);
    Random rand = new Random();
    int randNum = 0;
    int upperLimit = 100;
    int lowerLimit = 1;
    String myAnswer = "";

    do {
        randNum = rand.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
        System.out.println("I think it's " + randNum);
        myAnswer = in.nextLine();  
        print("if it is correct put \"y\" if its too low put \"tl\" if too high \"th\"");

        if(myAnswer.equalsIgnoreCase("tl")) {  //too low
            lowerLimit = randNum + 1;
        } 
        else if(myAnswer.equalsIgnoreCase("th")) { // too high
            upperLimit = randNum - 1;
        }   
    }while(!myAnswer.equalsIgnoreCase("y"));

    in.close();
    print("YAAAY! :D");
   
}
	







	
	////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		new Guess_my_number();
	
	///////////////////////////////////////	////////////////////////////////////////////
		
		//out.println("hello");
		//print("hello");
		//roll_dice();
		//roll_dice();
		//print("hello");
		//flip_coin();
		//int random_num = (int)(System.currentTimeMillis()%10);
		//print (random_num);
		
		//double random_num2 = Math.random();
		
		//print(random_num2);
		
		//int random_num3 = (int)(Math.random());
		
		//print(random_num3);
		
		//int random_num4 = ThreadLocalRandom.current().nextInt(1,3);
		//print(random_num4);
		
		
	}

}
