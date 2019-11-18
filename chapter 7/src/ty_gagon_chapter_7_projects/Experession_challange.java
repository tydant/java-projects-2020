package ty_gagon_chapter_7_projects;

public class Experession_challange {

	public Experession_challange() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		

		double allowance = 10.00;
		double movieCost = 12.50;
		double drinkCost = 2.25;
		 
		boolean canSeeMovie = allowance >= movieCost;
		System.out.println("canSeeMovie: " + canSeeMovie);
		 
		boolean canBuyDrink = drinkCost <= allowance;
		System.out.println("canBuyDrink: " + canBuyDrink);

		boolean drinksFor4 = allowance > (4 * drinkCost);
		System.out.println("drinksFor4: " + drinksFor4);
		 
		boolean bigSpender = (2 * allowance) > (movieCost + drinkCost);
		System.out.println("bigSpender: " + bigSpender);
		 
		boolean bigSaver = 50 < 4 * allowance;
		System.out.println("bigSaver: " + bigSaver);
		 
		boolean generousParents = !(allowance < 10);
		System.out.println("generousParents: " + generousParents);
		 
		boolean stayHome = (movieCost > allowance) && (drinkCost > allowance);
		System.out.println("stayHome: " + stayHome);
		 
		boolean shortCircuit = ((allowance == 10) || (allowance > 10 * 47 / 32 - 12 + 0 / 0));
		System.out.println("shortCircuit: " + shortCircuit);
	
	}

}
