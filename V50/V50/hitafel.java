package V50;

import java.util.Scanner;

public class hitafel {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number;
		
		boolean success = false;
		
		System.out.println("Write an integer: ");
		
		while (!success) {

		try {
			number = input.nextInt();
			System.out.println("the number is:" + number);
			success = true;
			
		} catch (Exception e) {
			input.next();
			System.out.println("You donne fuckt upp");
			
		}
		
	}
		System.out.println("hej");
	}
}
