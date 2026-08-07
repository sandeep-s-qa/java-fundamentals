package day02;

public class Day21ArraysPart3 {
	
	
	public static void main(String[] args){
	int[] numbers = {36,45,6,46,98};
	int max = numbers[0];
//	Maximum number in a array
	for (int i = 0 ; i<numbers.length;i++){
		if (max < numbers[i]) {
			max = numbers[i];
		}
	}
	System.out.println("Maximum element in the array " + max);
	
	//Minimum number in a array
	int min = numbers[0];
	for (int j = 0 ; j<numbers.length; j++) {
		if (min>numbers[j]) {
			min = numbers[j];
		}
	}
	System.out.println("Minium element in the array " + min);
	
//	Linear search
	int target = 46;
	boolean found = false;
	for (int k = 0; k<numbers.length;k++) {
	if (target == numbers[k]) {
		found = true;
		System.out.println("Target search number " + target + " is available ? " + found);
		break;
	}
	
	}
	}
}