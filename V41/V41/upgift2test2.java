package V41;

import java.util.Scanner;

public class upgift2test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int digit;
		int sum = 0;
		int tal;
		
		System.out.println("skreiv ett hel tal");
		
		tal = input.nextInt();
		
		while (tal != 0) {
			digit = tal % 10;
			sum += digit;
			tal /= 10;
			}
		System.out.println(sum);
		
	
		
	}

}
