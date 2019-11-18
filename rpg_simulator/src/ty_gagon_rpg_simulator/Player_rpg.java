package ty_gagon_rpg_simulator;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Player_rpg {
	//player attributes
	int totalhealth = 28000;
	int actHealth;
	String name;
	int atk = 10;
	int def = 10;
	String hairColor;
	String race;
	String class_stat;
	

	public Player_rpg() {
		Scanner input = new Scanner(System.in);
		//what happens when create cheracter
		System.out.println("what do you want to name your player");
		name = input.nextLine();
		System.out.println("what is your players hair color");
		hairColor = input.nextLine();
		while (true){
			System.out.println("are you a Human, Elf or dog");
			race = input.nextLine();
			if ( race.equals("Human") || race.equals("Elf") || race.equals("dog")) {
				break;
			}
		}
		while (true){
			System.out.println("are you a warior, mage or dogo");
			class_stat = input.nextLine();
			if ( class_stat.equals("waroir") || class_stat.equals("mage") || class_stat.equals("dogo")) {
				break;
			}
		
		}
		if (race.equals("Elf")) {
	def -=2;
	atk +=2;
		}
		else if (race.equals("dog")) {
	def +=20;
	atk +=20;
		}
		if (class_stat.equals("waroir")) {
	def +=5;
	atk -=2;
	actHealth = totalhealth * 2 ;
		}
		else if (class_stat.equals("mage"))	 {
	def -=8;
	atk +=10;
	actHealth = totalhealth * 5 ;
		}
		else {
	def +=20;
	atk +=20;
	actHealth = totalhealth * 10 ;
		}
		
		
  }


 // display stats
public void stats() {
	System.out.println("name: " + name);
	System.out.println("health: " + actHealth);
	System.out.println("attack: " + atk);
	System.out.println("defence: " + def);
	System.out.println("race: " + race);
	System.out.println("hair color: " + hairColor);
	System.out.println("class: " + class_stat);

		}

public int attack() {
	int damage = 0;
	int miss = ThreadLocalRandom.current().nextInt(1,6);
	if (miss == 3) {
		System.out.println("you missed");
		return damage;
	}
	int attack =ThreadLocalRandom.current().nextInt(20,42);
	damage = atk * attack + 7;
	return damage;
}

public int defend() {
	int blocked = 0;
	int miss = ThreadLocalRandom.current().nextInt(1,6);
	if (miss == 3) {
		System.out.println("you blocked an attack");
		return -1;
	}
	int defend =ThreadLocalRandom.current().nextInt(10,35);
blocked = def * defend + 17;

	return blocked;
}

public void Take_dmg(int dmg) {
	int block = defend(); 
	int totaldmg = 0;
	if (block < 0) {
		System.out.println ("and took 0 damage");
		return;
		}
	else {
		totaldmg = dmg - block;

	}
      actHealth -= totaldmg;
	}

public boolean die() {
	if (actHealth < 0) {
		return true;
	}
	else {
		return false;
	}
}












}