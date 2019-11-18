package ty_gagon_name_classes_example_project;

public class Exceptional_parsing {

	public Exceptional_parsing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new Exceptional_parsing();
		
		
		String myAge = "17";
		String myCost = "12.95";
		String myBool = "false";
		String myByte = "twelve";
		// Convert myAge to an integer
		int age = Integer.parseInt(myAge);
		System.out.println(age);
		// Convert myCost to a float
		float cost = Float.parseFloat(myCost);
		System.out.println(cost);
		// convert MyBool to a boolean
		boolean answer = Boolean.parseBoolean(myBool);
		System.out.println(answer);
		// convert myByte to a byte
		byte oops = Byte.parseByte(myByte); 
		// only contains numbers between -128 and 127
		System.out.println(oops);

	}

}
