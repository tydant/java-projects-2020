package ty_gagon_name_classes_example_project;

public class Exe_9_20_format {

	public Exe_9_20_format() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String result000 = String.format("Three %2$s %3$s", "brown" ,"yellow", "dogs");
		System.out.println(result000);
		
		String result01 = String.format("Three %2$15s %3$-15s", "brown" ,"yellow", "dogs");
		System.out.println(result01);
		
		
		String result00 = String.format("Three %s %s %s", "brown" ,"yellow", "dogs");
		System.out.println(result00);
		
		String result = String.format("%E" , 12.45678934);
		System.out.println(result);
		
		
		
		
	}

}
