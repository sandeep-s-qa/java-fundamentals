package day02;

public class Day14NestedIf {

	public static void main(String[] args) {
		
		boolean usernamecorrect = true;
		boolean passwordcorrect = true;
		
		if (usernamecorrect) {
			System.out.println("Username Verified");
			if (passwordcorrect) {
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
