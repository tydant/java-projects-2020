package ty_gagon_name_classes_example_project;

public class String_format_pi {

	public String_format_pi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new String_format_pi();
		
		double pi = 3.14159;
		String result;
		result = "PI = " + pi;
		
		System.out.println(result);
		
		result = String.format("PI = %f",pi);
		
		System.out.println(result);
		
		result = String.format("PI = %E",pi);
		
		System.out.println(result);
		
		result = String.format("PI = %.4s",pi);
		
		System.out.println(result);
		
		result = String.format("PI = %5.2f" ,pi);
		
		System.out.println(result);
		
		result = String.format("PI = %06.2f" ,pi);
		
		System.out.println(result);

	}

}
