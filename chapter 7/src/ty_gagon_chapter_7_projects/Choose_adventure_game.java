package ty_gagon_chapter_7_projects;



import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Choose_adventure_game {

	public Choose_adventure_game() {
		Scanner input = new Scanner(System.in);
		
	}
		public static void print(Object o) {
			System.out.println(o.toString());
	}
		public static void opt1() {
		
			Scanner input = new Scanner(System.in);
			
			print(" ");
			print(" welcome to the text adventure would you like to start \"yes\" or \"no\"");
			String start = input.next();
		if (start.equalsIgnoreCase("no")) {
			opt1();
		}
		if (start.equalsIgnoreCase("yes")) {
			print("lets begin");
		}
		}
		
		
		public static void opt2() throws InterruptedException {
			Scanner input = new Scanner(System.in);
			print(" ");
			print("you are in a creepy house there is a path on the \"left\" and the \"right\"");
			String option = input.next();
			
			if (option.equalsIgnoreCase("left")) {
				print("as you walk the hllway seems to get smaller and samller the way back is closing fast\nthe way in front seems to be closing slower");
				print(" ");
				TimeUnit.MILLISECONDS.sleep(7000);
				print("he, you cant outrun the walls \"YOU DIE\"");
				opt1();
				
			}
			if (option.equalsIgnoreCase("right")) {
				print("the hallway is dim and you cant see far infront of you\nbut as you walk the hallway opens up into a big room that has two hallways\nall the hallways are dim and the room your in is empty except a coupe of spider webs on the roof");
			}
		}
		
		public static void opt3() {
			
			Scanner input = new Scanner(System.in);
			
			print(" ");
			print(" the hallway on your \"left\" is covered in spider webs while the way on the \"right\" looks in good condition");
			String start = input.next();
		if (start.equalsIgnoreCase("left")) {
			print("you walk for a long time until you see some food on the ground");
		}
		if (start.equalsIgnoreCase("right")) {
			print("as you walk the path stays the same you keep walking for what seems like forever then you pass out and \"DIE FROM STARVATION\"");
			opt1();
		}
		}

public static void opt4() {
			
			Scanner input = new Scanner(System.in);
			
			print(" ");
			print("the food looks really good and you havent eaten in a long time do you \"eat\" in the spider web tunnel or \"keep going\" food and keep going");
			String start = input.next();
		if (start.equalsIgnoreCase("keep going")) {
			print("as you are walking it seems like its been a long time and you cant remember where your going you pass out and \"DIE FROM STARVATION\"");
			opt1();
		}
		if (start.equalsIgnoreCase("eat")) {
			print("when you start eating you realize just how hungry you are and think if you hadint eaten you might have died from starvation\nafter you finish you keep walking the hall opens up in a room where you find yourself in front of the  5 foot tall spider that created the spider webs");
		}
		}

public static void opt5() {
	
	Scanner input = new Scanner(System.in);
	
	print(" ");
	
	print("The spider is looking directly at you there are two ways of escape the \"left\" hallway which is pitch black and you cant see in to it at all\nand the \"right\" hallway which looks like a flight of stairs to go down down but you cant see the bottom ");
	
	String option = input.next();
	
	if (option.equalsIgnoreCase("left")) {
	print("it is dark for a long time but ones you find your way out its bright with asign saying welcome to the maze");
	}
	if (option.equalsIgnoreCase("right")) {
	print("as you walk down the stairs and as you go it gets darker and darker then the stairs fold in and become a slipery ramp you cant stop and you slide and fall of a cliff at the end of the ramp\"YOU DIED DO TO FALL DAMAGE\"");

		opt1();
	}
	}

	public static void opt6() {
	
	Scanner input = new Scanner(System.in);
	
	print(" ");
	print(" would you like to start the maze \"yes\" or \"no\"");
	String start = input.next();
	if (start.equalsIgnoreCase("no")) {
	opt6();
	}
	if (start.equalsIgnoreCase("yes")) {
	print("lets begin");
	}
	}

public static void opt7() {
	
	Scanner input = new Scanner(System.in);
	
	print(" ");
	
	print(" when you start letters float before you they say '''welcome to the first part of the maze this one is a simple choice \"left\" or \"right\"'''  ");
	
	String option = input.next();
	
	if (option.equalsIgnoreCase("left")) {
	print("\"YOU WERE INSTA-KILLED BECAUSE OF YOUR CHOICE\"");
	opt1();
	}
	if (option.equalsIgnoreCase("right")) {
	print("\"YOU HAVE PASSED THE FIRST PART YOU MAY GO ON\"");
	}
	}
	public static void opt8() {
	
	Scanner input = new Scanner(System.in);
	
	print(" ");
	
	print(" when you get to the next split more letters floatin front of you they say '''welcome to the second part of the maze this one is also simple choice \"left\" or \"right\"'''  ");
	
	String option = input.next();
	
	if (option.equalsIgnoreCase("left")) {
	print("\"YOU WERE INSTA-KILLED BECAUSE OF YOUR CHOICE\"");
	opt1();
	}
	if (option.equalsIgnoreCase("right")) {
	print("\"YOU HAVE PASSED THE SECOND PART YOU MAY GO ON\"");
	}
	}
	public static void opt9() {
	
	Scanner input = new Scanner(System.in);
	
	print(" ");
	
	print(" when you get to the next split more letters floatin front of you they say '''welcome to the THIRD part of the maze this one is a bit harder are there more \"left\" or \"right\" handed people on the earth'''  ");
	
	String option = input.next();
	
	if (option.equalsIgnoreCase("left")) {
	print("\"YOU WERE INSTA-KILLED BECAUSE OF YOUR CHOICE\"");
	opt1();
	}
	if (option.equalsIgnoreCase("right")) {
	print("\"YOU HAVE PASSED THE THIRD PART YOU MAY GO ON\"");
	}
	}

	public static void opt10() {
	
	Scanner input = new Scanner(System.in);
	
	print(" ");
	
	print(" when you get to the next split more letters floatin front of you they say '''welcome to the FOURTH part of the maze are you a \"male\" or a \"female\"'''  ");
	
	String option = input.next();
	
	if (option.equalsIgnoreCase("male")) {
	print("\"YOU HAVE PASSED THE THIRD PART YOU MAY GO ON\"");
	
	}
	if (option.equalsIgnoreCase("female")) {
	print("\"YOU HAVE PASSED THE THIRD PART YOU MAY GO ON\"");
	}
	}

	public static void opt11() {
	
	Scanner input = new Scanner(System.in);
	
	print(" ");
	
	print(" when you get to the next split more letters floatin front of you they say '''welcome to the FIFTH part of the maze in the FOURTH part of the maze was there a  RIGHT or WRONG ANSWER \"yes\" or\"no\"'''  ");
	
	String option = input.next();
	
	if (option.equalsIgnoreCase("yes")) {
	print("\"YOU WERE INSTA-KILLED BECAUSE OF YOUR CHOICE\"");
	opt1();
	}
	if (option.equalsIgnoreCase("no")) {
	print("\"YOU HAVE PASSED THE THIRD PART YOU MAY GO ON\"");
	}
	}
	public static void opt12() {
	
	Scanner input = new Scanner(System.in);
	
	print(" ");
	
	print(" when you get to the next split more letters floatin front of you they say '''welcome to the SIXTH part of the maze throughout the game have you ever gotten a third option in any decision \"yes\" or \"no\" ANSWER'''  ");
	
	String option = input.next();
	
	if (option.equalsIgnoreCase("yes")) {
	print("\"YOU WERE INSTA-KILLED BECAUSE OF YOUR CHOICE\"");
	opt1();
	}
	if (option.equalsIgnoreCase("no")) {
	print("\"YOU HAVE PASSED THE THIRD PART YOU MAY GO ON\"");
	}
	}
public static void opt13() {
	
	Scanner input = new Scanner(System.in);
	
	print(" ");
	
	print(" when you get to the next split more letters floatin front of you they say '''welcome to the SEVEN part of the maze do you think your awsome \"yes\" or \"no\"'''  ");
	
	String option = input.next();
	
	if (option.equalsIgnoreCase("no")) {
	print("\"YOU WERE INSTA-KILLED BECAUSE OF YOUR NOT THINKING YOUR AWSOME CHOICE\"");
	opt1();
	}
	if (option.equalsIgnoreCase("yes")) {
	print("\"YOU HAVE PASSED THE THIRD PART YOU MAY GO ON\"");
	}
	}
	public static void opt14() {
	
	Scanner input = new Scanner(System.in);
	
	print(" ");
	
	print(" when you get to the next split more letters floatin front of you they say '''welcome to the EIGHTH part of the maze do you want to leave the maze \"yes\" or \"no\"'''  ");
	
	String option = input.next();
	
	if (option.equalsIgnoreCase("no")) {
	print("\"YOU WERE INSTA-KILLED BECAUSE OF YOUR NOT WANTING TO LEAVE NOW YOU CAN NEVER LEAVE\"");
	opt1();
	}
	if (option.equalsIgnoreCase("yes")) {
	print("\"YOU HAVE PASSED THE THIRD PART YOU MAY GO ON AND EXIT THE MAZE\"");
	}
	}
	public static void opt15() {
	
	Scanner input = new Scanner(System.in);
	
	print(" ");
	print(" would you like to RE-start the maze \"yes\" or \"no\"");
	String start = input.next();
	if (start.equalsIgnoreCase("no")) {
	print("ok your a normal person ");
	}
	if (start.equalsIgnoreCase("yes")) {
	print("lets begin AGAIN");
	opt6();
	}
	}
	public static void opt16() {
	
	Scanner input = new Scanner(System.in);
	
	print(" ");
	
	print("you are ouside the maze there are two path ways booth look equaly as dark the \"right\" looks bland while the \"left\" looks cool");
	
	String option = input.next();
	
	if (option.equalsIgnoreCase("left")) {
	print("after walking for a while you find a black curtain");
	}
	if (option.equalsIgnoreCase("right")) {
	print("as you walk down the hallway and as you go it gets darker and darker and you walk of a clif and fall for what seems like forever but there is an end and its not good \"YOU DIED DO TO FALL DAMAGE\"");

		opt1();
	}
	}
	public static void opt17() {
	
	Scanner input = new Scanner(System.in);
	
	print(" ");
	
	print("as your in the rave room you feel the need to stay and live there you could \"stay\" there or follow the signs to the exit and \"leave\"");
	
	String option = input.next();
	
	if (option.equalsIgnoreCase("leave")) {
	print("after walking for a while and following the exit signs you find to get out and eventually you find black curtains to exit the rave ");
	}
	if (option.equalsIgnoreCase("stay")) {
	print("you stay and party by your self until you Die");
		opt1();
	}
	}
public static void opt18() {
	
	Scanner input = new Scanner(System.in);
	
	print(" ");
	
	print("you feel a stong pull to stay as yu open the curtsains do you want to leave like really want to \"leave\" or \"stay\"");
	
	String option = input.next();
	
	if (option.equalsIgnoreCase("leave")) {
	print("after walking out of the club you apear in a room you remember but the doors and windows are open the suns shinning and and the place feels like home  ");
	}
	if (option.equalsIgnoreCase("stay")) {
	print("you stay and party by your self unti, you Die");
		opt1();
	}
	}
public static void opt19() {
	
	Scanner input = new Scanner(System.in);
	
	print(" ");
	
	print("you feel like this is hame and is where you want to \"stay\" but you could also open the door and \"look\" out to see whats out there ");
	String option = input.next();
	
	if (option.equalsIgnoreCase("look")) {
	print("after walking out of the club you apear in a room you remember but the doors and windows are open the suns shinning and and the place feels like home  ");
	}
	if (option.equalsIgnoreCase("stay")) {
	print("you stay and within the comfort of this house for many years with food taht apears out of thin air and all the stuff you could ever want ignorant of whats beyond this house that was ones creepy to you but is now home you die of old age");
		opt1();
	}
	}
public static void opt20() {
	
	Scanner input = new Scanner(System.in);
	
	print(" ");
	
	print("when you look outside you see a place thats dreary and empty of happyness only\n greed, jelousy, lust, and vengence are all that remains but you feel that that is the real world\n the one you used to live in you could\n \"stay\" in the imaginary perfect world or \"leave\" to face the dark real world");
	String option = input.next();
	
	if (option.equalsIgnoreCase("leave")) {
	print("after walking out of the house you enter the real dreary world \"THE END\" ");
		opt1();
	}
	if (option.equalsIgnoreCase("stay")) {
	print("you stay in the house and live like you want but as years go what you saw in the outside world eats you up and after many years the stress gets to you and you \"die of a heart attack\"");
		opt1();
	}
	}


	public static void main(String[] args) throws InterruptedException {
		new Choose_adventure_game();

		Scanner input = new Scanner(System.in);
		
		
		opt1();
		
		opt2();
	
		opt3();
	
		opt4();
		
		opt5();
		
		opt6();
		
		opt7();
		
		opt8();
		
		opt9();
		
		opt10();
		
		opt11();
		
		opt12();
		
		opt13();
		
		opt14();
		
		opt15();
		
		opt16();
		
		opt17();
		
		opt18();
		
		opt19();
		
		opt20();
		
	
	}

}
