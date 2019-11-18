package ty_gagon_compus_chapter_8;

import java.util.Scanner;

public class l_1_methods {
//class scope
	public l_1_methods() {
		//System.out.println("hello");
		
		}
	//constructor scope
////////////////////////////////////////////////////////////////////////////////////////	
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
	//print scope
///////////////////////////////////////////////////////////////////////////////////////
	
	public static void area(double base,double width) {
		
		double abase = base;
		double awidth = width;
		double answer = abase * awidth;
		print(answer);
	}
/////////////////////////////////////////////////////////////////////////////////////////////
	
	public static double area(double side) {
		
		double abase = side;
		double answer = abase * abase;
		return answer;
	}
////////////////////////////////////////////////////////////////////////////////////////////	
	public static double tri_area(double base, double height) {
		double answer = base * height /2;
		return answer;
	}
///////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
///////////////////////////////////////////////////////////////////////////////////////////
	//main scope
	public static void main(String[] args) {
		new l_1_methods();
		
		
		double tri = tri_area(10,50);
		double squ = area(10);
		area(11,84);
		area(110,7684);
		area(10);
		print(tri);
		print(squ);
		area(squ,tri);
	}

}
