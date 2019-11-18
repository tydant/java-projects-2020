package ty_gagon_chapter_7_projects;

import java.util.Scanner;

public class B_day_guess {

	public B_day_guess() {
	
		String set1 = " 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31";
		String set2 = " 2 3 6 7 10 11 14 15 18 19 22 23 26 27 30 31";
	    String set3 = " 4 5 6 7 12 13 14 15 20 21 22 23 28 29 30 31";
	    String set4 = " 8 9 10 11 12 13 14 15 24 25 26 27 28 29 30 31";
	    String set5 = " 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31";
	    
	    int day = 0;
	    int month = 0;
	    int year = 0;
	    Scanner input= new Scanner(System.in);
	    
	    System.out.print("is your birth day in this set of numbers?     ");
	    System.out.println(set1);
	    System.out.println("enter n for No and y for Yes");
	    char answer = input.next().charAt(0);
	    
	    if (answer == 'y') {
	    	day+= 1;
	    }
	    
	    
	    System.out.print("is your birth day in this set of numbers?     ");
	    System.out.println(set2);
	    System.out.println("enter n for No and y for Yes");
	    answer = input.next().charAt(0);
	    
	    if (answer == 'y') {
	    	day+= 2;
	    }
	    
	    
	    
	    System.out.print("is your birth day in this set of numbers?     ");
	    System.out.println(set3);
	    System.out.println("enter n for No and y for Yes");
	    answer = input.next().charAt(0);
	    
	    if (answer == 'y') {
	    	day+= 4;
	    }
	    
	    
	    System.out.print("is your birth day in this set of numbers?     ");
	    System.out.println(set4);
	    System.out.println("enter n for No and y for Yes");
	    answer = input.next().charAt(0);
	    
	    if (answer == 'y') {
	    	day+= 8;
	    }
	    
	    
	    System.out.print("is your birth day in this set of numbers?     ");
	    System.out.println(set5);
	    System.out.println("enter n for No and y for Yes");
	    answer = input.next().charAt(0);
	    
	    if (answer == 'y') {
	    	day+= 16;
	    }
	    
////////////////////////////////////////////////////////////////////////////////////////	    
	    
	    String setm1 = " 1 3 5 7 9 11 ";
		String setm2 = " 2 3 6 7 10 11 ";
	    String setm3 = " 4 5 6 7 12 ";
	    String setm4 = " 8 9 10 11 12 ";
	    
	    
	    

	    System.out.print("is your birth month in this set of numbers?     ");
	    System.out.println(setm1);
	    System.out.println("enter n for No and y for Yes");
	    char manswer = input.next().charAt(0);
	    
	    if (manswer == 'y') {
	    	month+= 1;
	    }
	    
	    
	    System.out.print("is your birth month in this set of numbers?     ");
	    System.out.println(setm2);
	    System.out.println("enter n for No and y for Yes");
	   manswer = input.next().charAt(0);
	    
	    if (manswer == 'y') {
	    	month+= 2;
	    }
	    
	    System.out.print("is your birth month in this set of numbers?     ");
	    System.out.println(setm3);
	    System.out.println("enter n for No and y for Yes");
	    manswer = input.next().charAt(0);
	    
	    if (manswer == 'y') {
	    	month+= 4;
	    }
	    
	    System.out.print("is your birth month in this set of numbers?     ");
	    System.out.println(setm4);
	    System.out.println("enter n for No and y for Yes");
	    manswer = input.next().charAt(0);
	    
	    if (manswer == 'y') {
	    	month+= 8;
	    }
	    
	   
	    
	    
///////////////////////////////////////////////////////////////////////////////////////
	    
	    String set10 = "1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99";
		String set11 = "2 3 6 7 10 11 14 15 18 19 22 23 26 27 30 31 34 35 38 39 42 43 46 47 50 51 54 55 58 59 62 63 66 67 70 71 74 75 78 79 82 83 86 87 90 91 94 95 98 99";
		String set12 = "4 5 6 7 12 13 14 15 20 21 22 23 28 29 30 31 36 37 38 39 44 45 46 47 52 53 54 55 60 61 62 63 68 69 70 71 76 77 78 79 84 85 86 87 92 93 94 95"; 
		String set13 = "8 9 10 11 12 13 14 15 24 25 26 27 28 29 30 31 40 41 42 43 44 45 46 47 56 57 58 59 60 61 62 63 72 73 74 75 76 77 78 79 88 89 90 91 92 93 94 95";
		String set14 = "16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95";
		String set15 = "32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 95 96 97 98 99";
		String set16 = "64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99";
	
	
	    System.out.print("is your birth year in this set of numbers?     ");
	    System.out.println(set10);
	    System.out.println("enter n for No and y for Yes");
	    char yanswer = input.next().charAt(0);
	    
	    if (yanswer == 'y') {
	    	year+= 1;
	    }
	    
	    
	    System.out.print("is your birth year in this set of numbers?     ");
	    System.out.println(set11);
	    System.out.println("enter n for No and y for Yes");
        yanswer = input.next().charAt(0);
	    
	    if (yanswer == 'y') {
	    	year+= 2;
	    }
	    
	    System.out.print("is your birth year in this set of numbers?     ");
	    System.out.println(set12);
	    System.out.println("enter n for No and y for Yes");
	    yanswer = input.next().charAt(0);
	    
	    if (yanswer == 'y') {
	    	year+= 4;
	    }
	    
	    System.out.print("is your birth year in this set of numbers?     ");
	    System.out.println(set13);
	    System.out.println("enter n for No and y for Yes");
	    yanswer = input.next().charAt(0);
	    
	    if (yanswer == 'y') {
	    	year+= 8;
	    }
	    
	    System.out.print("is your birth year in this set of numbers?     ");
	    System.out.println(set14);
	    System.out.println("enter n for No and y for Yes");
	    yanswer = input.next().charAt(0);
	    
	    if (yanswer == 'y') {
	    	year+= 16;
	    }
	    
	    System.out.print("is your birth year in this set of numbers?     ");
	    System.out.println(set15);
	    System.out.println("enter n for No and y for Yes");
	    yanswer = input.next().charAt(0);
	    
	    if (yanswer == 'y') {
	    	year+= 32;
	    }
	    
	    System.out.print("is your birth year in this set of numbers?     ");
	    System.out.println(set16);
	    System.out.println("enter n for No and y for Yes");
	    yanswer = input.next().charAt(0);
	    
	    if (yanswer == 'y') {
	    	year+= 64;
	    }
	    
	    
	    
	    
	    System.out.println("your birthday is on the "+ month +" " + day + " " + year);
	    
	    
	    
	    
	}
	

	public static void main(String[] args) {
		new B_day_guess();

	}

}
