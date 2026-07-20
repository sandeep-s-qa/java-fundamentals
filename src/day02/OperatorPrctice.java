package day02;

public class OperatorPrctice {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 6;
		System.out.println("Addition: " + (a + b));  //Addition: 26
		System.out.println("Subtraction: " + (a - b)); //"Subtraction: 14
		System.out.println("Multiplication: " + (a * b)); //"Multiplication: 120 
		System.out.println("Division: " + (a / b)); //"Division: 3
		System.out.println("Modulus: " + (a % b));//Modulus: 2
		
		int i =5;
		
		System.out.println("Post Increment: " + (i++));  //5
		System.out.println("Current i: " + i); //6

		System.out.println("Pre Increment: " + (++i)); //7
		System.out.println("Current i: " + i); //7

		System.out.println("Post Decrement: " + (i--)); //7
		System.out.println("Current i: " + i); //6

		System.out.println("Pre Decrement: " + (--i)); //5
		System.out.println("Current i: " + i); //5

	}

}
