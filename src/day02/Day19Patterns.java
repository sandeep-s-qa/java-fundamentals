package day02;

public class Day19Patterns {

	public static void main(String[] args) {
		
//		for (int i = 1; i <=4 ; i++) {
//			
//		//Printing spaces - inner loop 1
//			
//			for (int j = 1; j<=4-i ; j++) {
//				System.out.print("  ");
//			}
//			for (int k = 1; k<=i ; k++) {
//				System.out.print("* ");
//			} 
//		System.out.println();
//		}
				
//		for (int i = 1; i<=4; i++) {	//Outer loop controls the rows
//			for (int j = 1; j<i ; j++) {
//				System.out.print("  ");
//		    }
//			for (int k =4; k>=i ; k--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//	    }
		int number = 0;
		for (int i = 1; i<=4; i++) {
			for (int j = 1; j<=i; j++) {
				number = number +1;
				System.out.print(number + " ");
			}
			for (int k = 1; k<=4-i; k++) {
				System.out.print("  ");
			}
			System.out.println();
		}

	}
}
