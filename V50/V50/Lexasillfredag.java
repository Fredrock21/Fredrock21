package V50;

import java.util.Scanner;

public class Lexasillfredag {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean success = false;
		String J;
		System.out.println("Så du vill böja lysna på rock");
		
		boolean loop = false;
		
		while(!loop) {
			
		while (!success) {
			System.out.println("ja eller nej");
		
			J = input.nextLine();
		
			if(J.equals("ja")) {
				System.out.println("bra");
				success = true;
			}
			else {
				input.next();
				System.out.println("du är fel");
				
			}
		}
		

		System.out.println("Välj en sanger att börja lynssa på");
		System.out.println("(1) - Rock");
		System.out.println("(2) - Metal");
		System.out.println("(3) - Power Metal");
		System.out.println("(4) - Punk");
		System.out.println("(5) - Alternativ Metal");
		System.out.println("(6) - Quit");
		System.out.println();
		
		int choice = input.nextInt();
		
		musick(choice);
		
		}

	

	}
	public static void musick(int choice) {
		
		String genre;
		
		switch (choice) {
		case 1:
			genre = "Rock";
			System.out.println("du valde " + genre + "! här har du en del band att börja med!");
			System.out.println();
			System.out.println("1. Blink-182 ");
			System.out.println("2. Sum 41");
			System.out.println("3. The Offspring");
			System.out.println();
			break;
		case 2:
			genre = "Metal";
			System.out.println("du valde " + genre + "! här har du en del band att börja med!");
			System.out.println();
			System.out.println("1. Five Finger Death Punch");
			System.out.println("2. In Flames");
			System.out.println("3. Disturbed");
			System.out.println();
			break;
		case 3:
			genre = "Power Metal";
			System.out.println("du valde " + genre + "! här har du en del band att börja med!");
			System.out.println();
			System.out.println("1. Gamma Ray");
			System.out.println("2. Sonata Arctica");
			System.out.println("3. Powerwolf");
			System.out.println();
			break;
		case 4:
			genre = "Punk";
			System.out.println("du valde " + genre + "! här har du en del band att börja med!");
			System.out.println();
			System.out.println("1. Sex Pistols");
			System.out.println("2. Ramones");
			System.out.println("3. Anti-Flag");
			System.out.println();
			break;
		case 5:
			genre = "Alternativ Metal";
			System.out.println("du valde " + genre + "! här har du en del band att börja med!");
			System.out.println();
			System.out.println("1. System of a Down");
			System.out.println("2. Three Days Grace");
			System.out.println("3. Rammstein");
			System.out.println();
			break;
		case 6:
			System.out.println("Tack och rocka på!");
			break;
		default:
			genre = "Schanger";
			System.out.println("Du har inte valt en rock " + genre + "! Du är en scam för din familj!");
			System.out.println();
			break;
		}
		
	}

}
