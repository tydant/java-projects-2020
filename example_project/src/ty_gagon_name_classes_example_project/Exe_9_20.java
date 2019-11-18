package ty_gagon_name_classes_example_project;

public class Exe_9_20 {

	public Exe_9_20() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new Exe_9_20();	
		
		String mystring = "look out";
		boolean result1 = mystring.contains("out");
		System.out.println (result1);

		String mystringfood = "Pizza, Hot Dogs, Icecream, Chease cake";
		boolean result2 = mystringfood.contains("Pizza");
		if (mystringfood.contains("Pizza")) {
			System.out.println ("eat here");
		}
		else {
			System.out.println ("dont eat here");
		}
		
		
		System.out.println (result2);
		String mystring2 = "hello";
		int result3 =mystring2.lastIndexOf("q");
		System.out.println(result3);
		String mystring3 = "the quick old_man wolk up from his dream of being fast";
		int result4 = mystring3.length();
		System.out.println(result4);
		
		
		String result5 = mystring3.replace("e" , "q");
		String result6 = mystring3.replace("_" , " ");
		System.out.println (result5);
		System.out.println (result6);
		
		
		int startpos = mystring3.lastIndexOf("q");
		int endpos = mystring3.indexOf("n");
		System.out.println (startpos);
		System.out.println (endpos);
		String result7 = mystring3.substring(startpos , endpos+1);
		System.out.println (result7);
		
		
		
		int startpos2 = mystring3.indexOf(" f");
		int endpos2 = mystring3.indexOf("is");
		System.out.println (startpos2);
		System.out.println (endpos2);
		String result8 = mystring3.substring(startpos2 , endpos2+2);
		System.out.println (result8);
		
		
		
		
		if (mystring3.contains("old_man")) {
			int startpos3 = mystring3.indexOf("old");
			int endpos3 = mystring3.indexOf("man")+3;
			String result9 = mystring3.substring(startpos3 , endpos3+1);
			System.out.println (result9);
		}
		System.out.println (result8.toUpperCase());
		
		
		
				
	}
	
	

}
