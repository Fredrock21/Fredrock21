package V50;

import java.util.Scanner;

public class Nyloop {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		int choise;
		
		System.out.println("välkomen! välj något av dessa alternativ");
		System.out.println("(1) - New game");
		System.out.println("(2) - Load game");
		System.out.println("(3) - Options");
		System.out.println("(4) - Credits");
		System.out.println("(5) - Quit");
		System.out.println();
		
		choise = input.nextInt();
		
		switch (choise) {
		case 1:
			System.out.println("spelet starta");
			
			break;
			
		case 2:
			System.out.println("välj vilken seve");
			break;
			
		case 3:
			System.out.println("välj dina setings");
			break;
			
		case 4:
			System.out.println("tack till mig");
			break;
			
		case 5:
			System.out.println("spelst kan inte avslutas :^) ");
			break;
			
		default:
			System.out.println("men vad fan");
			break;
		}
	}

}
