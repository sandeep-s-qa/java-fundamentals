package day02;

public class Day14NestedIf {

	public static void main(String[] args) {
		
		boolean usernameCorrect = true;
		boolean passwordCorrect = true;
		
		if (usernameCorrect) {
			System.out.println("Username Verified");
			if (passwordCorrect) {
				System.out.println("Password Verified");
				System.out.println("Welcome Sandeep");
			}else{
				System.out.println("Password incorrect");
			}
			
		    }else {
			System.out.println("Username incorrect");	
		}
		     System.out.println("Process completed");
	}

}
