package dog_house;

public class Dog {
	private int numTimesFed = 0;
	 private boolean sleeping = false;
	 private String name = "Ruffer";
	 
	 public String getName() {
		 return name;
	 }
	 
	 public void wakeUp() {
	      System.out.println("WAKING UP");
	      numTimesFed = 0;
	      sleeping = false;
	 }
	 
	 public void sleep() {
	      System.out.println("SLEEPING");
	      sleeping = true;
	   }
	 public void hear(String sound) {
		 if (sleeping)
	         return; 
	 
	 if (sound.equals(name)) {
		 System.out.println("wag tail"); 
	 
	 }
	 else if (sound.equals("ding-dong")) {
		 System.out.println("BARK");
	 	}
	 }
	 public void feed() {
	      if (sleeping)
	    	  return; 
	      
	      
	      if (numTimesFed > 2) {
	    	  System.out.println("YAWN");
	      }
	      else {
	    	  System.out.println("YUMMY");
	      }
	   }
	 
	 
	 
	 
	 
	public Dog() {
		// TODO Auto-generated constructor stub
	}

}
