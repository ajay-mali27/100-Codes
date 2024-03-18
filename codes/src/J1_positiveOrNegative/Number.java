package J1_positiveOrNegative;
import java.util.Scanner;

public class Number {
//check if a number is positive or negative.
	
	public static void main(String[] args) {
		
		
		Scanner SC =new Scanner(System.in);
		
		System.out.println("Enter The Number ");
		
		int sum=SC.nextInt();
		
		if(sum >0) {
			System.out.println("The Number "+sum+ " : is Positive");
		}
		
		else if (sum <0){
			System.out.println("The Number "+sum+" :is Negative");
		}
	}
	
}
