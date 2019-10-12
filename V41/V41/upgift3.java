package V41;

import java.util.Scanner;

public class upgift3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
		
		boolean exit = false;
		double i = -1.0;
		double sum = 0.0;
		double tal;
		
		do {
			
			tal = input.nextInt();
			System.out.println(tal);
			i += 1.0;
			sum += tal;
			if (tal == 0) {
				exit = true;
				System.out.println(sum);
				System.out.println(sum/i);
			}
			
		}
		while (!exit); 

	}

}
