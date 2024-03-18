package J2_OddEven;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
//System.out.println("Enter The Number");

		System.out.println("Enter The Number");
		Scanner SC = new Scanner(System.in);
		int sum = SC.nextInt();

		System.out.println("You Entered :" + sum);

		if(sum%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}

	}
}
