package ty_gagon_compus_chapter_8;

public class Checkerboard {

	public Checkerboard() {
		// TODO Auto-generated constructor stub
	}
	public static void print(Object o) {
		System.out.print(o.toString());
	}
	
	public static void printCheckerboard(int num_coll, int num_rows) {
		
		
		
		for (int row=0; row<num_rows; row++) {
		
			 for (int col=0; col<num_coll; col++) {
				 
				 
		  if (row%2 == 0) 
			  {
				 if (col%2 == 0)
				 { 
					 print("#");
				 }
				 else 
				 {
					 print(" ");
				 }
			   }
		  else
		        {
					 if (col%2 ==0)
					 {
						 print(" ");
					 }
					 else
					 {
						 print("#");
					 }
		         }
			 }  
			 System.out.println();
		
		
		
		}
		System.out.println();
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		new Checkerboard();
	
		printCheckerboard(3,5);
		
		System.out.println("////////////////////////////////////////////////////////////////////////");

		printCheckerboard(4,3);
		
		System.out.println("////////////////////////////////////////////////////////////////////////");

		printCheckerboard(8,8);
		
		System.out.println("////////////////////////////////////////////////////////////////////////");
	
		
	
	
	
	
	}

}
