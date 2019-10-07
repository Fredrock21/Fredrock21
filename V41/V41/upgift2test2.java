package V41;

import java.util.Scanner;

public class upgift2test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		boolean exit = false;
		
		do {
			String line = input.nextLine();
			if (line.equals("exit")) {
				exit = true;
			}
		}
		while (!exit); 
	}

}
