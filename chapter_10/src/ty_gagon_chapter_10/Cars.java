package ty_gagon_chapter_10;

import java.util.Scanner;

public class Cars {
	
	private String brand;
	private int year;
	private String body_style;
	private String make;
	private int door_count;
	String color;

	public Cars() {
		Scanner input = new Scanner(System.in);
		System.out.println("what brand of car do you drive");
		brand = input.nextLine();
		System.out.println("what body style of car do you drive");
		body_style = input.nextLine();
		System.out.println("what make of car do you drive");
		make = input.nextLine();
		System.out.println("what color is the car you drive");
		color = input.nextLine();
		System.out.println("how many doors does your car have");
		door_count = input.nextInt();
		System.out.println("what year of car do you drive");
		year = input.nextInt();
		
	}
	public Cars(String brandx,int yearx,int doorsx,String colorx) {
		brand = brandx;
		year = yearx;
		door_count = doorsx;
		color = colorx;
		
	}
	public Cars(String brand, int year, String body_style, String make, int door_count, String color) {
		
		this.brand = brand;
		this.year = year;
		this.body_style = body_style;
		this.make = make;
		this.door_count = door_count;
		this.color = color;
	}
	public Cars(String color) {
		this.brand = "toyota";
		this.year = 2019;
		this.body_style = "coups";
		this.make = "mustang";
		this.door_count = 2;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
			return year;
		
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBody_style() {
		return body_style;
	}

	public void setBody_style(String body_style) {
		this.body_style = body_style;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getDoor_count() {
		return door_count;
	}

	public void setDoor_count(int door_count) {
		this.door_count = door_count;
	}



	public void drive() {
		
	}
	public void start() {
		
	}
	public void stop() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
