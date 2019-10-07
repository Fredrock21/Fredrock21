package V41;

import java.util.Scanner;

public class upgift3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
		
		boolean exit = false;
		int i = 0;
		int sum = 0;
		
		do {
			
			String tal = input.nextLine();
			System.out.println(tal);
			i += 1;
			sum += tal;
			if (tal.equals("0")) {
				exit = true;
			}
			
		}
		while (!exit); 

	}

}
