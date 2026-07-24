package day02;

public class Day15SwitchString {

	public static void main(String[] args) {
		
		String browser  = "Safari";
		
		switch(browser){
		
		case "Chrome": 
			System.out.println("Launching Chrome");
			break;
		case "Edge": 
			System.out.println("Launching Edge");
			break;
		case "Firefox": 
			System.out.println("Launching Firefox");
			break;
		default : 
			System.out.println("Browser Not Supported");
		}
		System.out.println("Done");

	}

}
