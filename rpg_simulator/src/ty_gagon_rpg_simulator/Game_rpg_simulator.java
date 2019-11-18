package ty_gagon_rpg_simulator;

import java.util.Scanner;

public class Game_rpg_simulator {

	public static void main(String[] args) {
		
		opt1();
		
		// player
		Player_rpg bob = new Player_rpg();
		Bad_guy_rpg jo = new Bad_guy_rpg();
		System.out.println(" hit enter to move turns");
		while (true) {
			
			String enter;
			Scanner input = new Scanner(System.in);
			
			
			enter = input.nextLine();
			
			bob.stats();
			System.out.println(" ");
			jo.stats();
			System.out.println(" ");
			
			System.out.println("you attack");
			int bdmg = bob.attack();
			jo.Take_dmg(bdmg);
			boolean jdie = jo.die();
			
			
			
			String jodie = Boolean.toString(jdie);
			if (jodie.equals("true")) {
				System.out.println("jo has died");
				break;
			}
			bob.stats();
			System.out.println(" ");
			jo.stats();
			System.out.println(" ");
			
			int jdmg = jo.attack();
			bob.Take_dmg(jdmg);
			boolean bdie = bob.die();
			
			
			String bobdie = Boolean.toString(bdie);
			if (bobdie.equals("true")) {
				System.out.println("you have died");
				break;
			}
		
			
		}
		/*jo.stats();
		int dmg = jo.attack();
		System.out.println(dmg);
		dmg = jo.attack();
		System.out.println(dmg);
		dmg = jo.attack();
		System.out.println(dmg);
		int def =jo.defend();
		System.out.println(def);
		def =jo.defend();
		System.out.println(def);
		jo.stats();
		jo.Take_dmg(2000000000);
		jo.stats();
		boolean die = jo.die();
		System.out.println(die);
		*/
	}

	public static void opt1() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println(" welcome to the rpg would you like to start \"yes\" or \"no\"");
		String start = input.next();
	if (start.equalsIgnoreCase("no")) {
		opt1();
	}
	if (start.equalsIgnoreCase("yes")) {
		System.out.println("lets begin");
	}
	}
	
}
