package ty_gagon_rpg_simulator;

import java.util.concurrent.ThreadLocalRandom;

public class Bad_guy_rpg {
	int totalhealth = 5000000;
int def = 2;
int atk= 20;
String name = "jo";
int actHealth;

	public Bad_guy_rpg() {
		
		actHealth = ThreadLocalRandom.current().nextInt(5,totalhealth);
		
	}
	public void stats() {
		System.out.println("bad guy name: " + name);
		System.out.println("health: " + actHealth);
		

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