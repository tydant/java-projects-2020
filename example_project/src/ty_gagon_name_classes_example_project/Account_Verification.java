package ty_gagon_name_classes_example_project;

public class Account_Verification {

	public Account_Verification() {
		String stoUsername = "username";
		String stoPassword = "password";
		
		String inusername = "USERNAME";
		String inPassword = "Password";
		
		boolean usernameMatch = stoUsername.equalsIgnoreCase(inusername);
		boolean passwordMatch = stoPassword.equalsIgnoreCase(inPassword);
		
		System.out.println("Username Match:" + usernameMatch);
		System.out.println("password Match:" + passwordMatch);
		
	}

	public static void main(String[] args) {
		new Account_Verification();

	}

}
