package ty_gagon_name_classes_example_project;

public class String_fun {

	public String_fun() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new String_fun();
		  
		
		String song = "Great Song";
		
		int songlength = song.length();
		
		boolean contains = song.contains("Great");
		
		int tindex =song.indexOf("t");
		
		String replacesong = song.replace("reat", "ood");

		String sub = song.substring(4);
		
		String upper = song.toUpperCase(); 
		
		System.out.println("Song length: " + songlength);
		System.out.println("Song contains Great: " + contains);
		System.out.println("Index of t: " + tindex);
		System.out.println("Replaced song: " + replacesong);
		System.out.println("Substring: " + sub);
		System.out.println("Upper: " + upper + "!");
		
		
	}

}
