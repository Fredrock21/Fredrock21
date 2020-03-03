
import java.util.Scanner;

public class gisningslek {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {		

		System.out.println(
				"I deta spelet ska du gisa ett tall mellan n�gra interval du f�r 5 f�rs�k p� dig! V�lj sv�righets grad");
		boolean success = false;
		while (!success) {

			System.out.println("[1] l�tt 1-10");
			System.out.println("[2] mellan 1-100");
			System.out.println("[3] sv�r 1-1000");
			System.out.println();

			int choice = 0;
			
			boolean validInput = false;
			while (!validInput) {
				try {
					choice = input.nextInt();
					validInput = true;
						
					} catch (Exception e) {
						input.nextLine();
						System.out.println("skriv in 1,2 eller 3 ");
					}
			}
			
			
			switch (choice) {
			
			case 1:
				System.out.println("du valde l�tt");
				long l�tt = Math.round((Math.random() * 10));

				l�ttaste(l�tt);

				break;

			case 2:
				System.out.println("du valde mellan");
				long medel = Math.round((Math.random() * 100));

				mellan(medel);

				break;

			case 3:

				System.out.println("du valde sv�r");
				long sv�r = Math.round((Math.random() * 1000));

				sv�raste(sv�r);

				break;

			default:

				System.out.println("du har inte valt en sv�righetsgard :(");

				break;

			}
			
			String J;
			System.out.println("vill du spela i gen?");
			System.out.println("skriv ja om du vill forts�ta");
			
			input.nextLine();// g�r till nesta rad 
			
			J = input.nextLine();
			

			if (J.equals("ja")) {
				System.out.println("bra");

			} 
			
			else {
				System.out.println("okej ha de bra");
				success = true;
			}
		
			
	}
}
	
	/**
	 * tar in l�ng l�tt
	 * @param l�tt
	 * kolar om svar �r ett giltit (try/catch)
	 * kollar om svar �t = l�tt.
	 * koden slurar n�r svar = l�tt eller gisnigar = 0. 
	 */
	public static void l�ttaste(long l�tt) {

		int svar = 0;

		int gisnigar = 5;

		boolean exit = false;

		while (!exit) {
			
			boolean validInput = false;
			while (!validInput) {
				try {
					svar = input.nextInt();
					validInput = true;
						
					} catch (Exception e) {
						input.nextLine();
						System.out.println("svara med en sifra ");
					}
			}
			

			if (svar == l�tt) {
				exit = true;
				System.out.println("du har r�tt de svaret var " + l�tt);

			}

			else if (svar > l�tt) {

				gisnigar--;

				System.out.println("l�gre du har " + gisnigar + " gisnigar kvar");

			} else if (svar < l�tt) {

				gisnigar--;

				System.out.println("h�gre du har " + gisnigar + " gisnigar kvar");

			}
			if (gisnigar == 0) {

				exit = true;
				System.out.println("du mislykades svaret var" + l�tt);
			}

		}

	}
	/**
	 * tar in l�ng medel
	 * @param l�tt
	 * kolar om svar �r ett giltit (try/catch)
	 * kollar om svar �t = l�tt.
	 * koden slurar n�r svar = medel eller gisnigar = 0. 
	 */

	public static void mellan(long medel) {

		int svar = 0;

		int gisnigar = 5;

		boolean exit = false;

		while (!exit) {

			boolean validInput = false;
			while (!validInput) {
				try {
					svar = input.nextInt();
					validInput = true;
						
					} catch (Exception e) {
						input.nextLine();
						System.out.println("svara med en sifra ");
					}
			}

			if (svar == medel) {
				exit = true;
				System.out.println("du har r�tt de svaret var " + medel);

			}

			else if (svar > medel) {

				gisnigar--;

				System.out.println("l�gre du har " + gisnigar + " gisnigar kvar");

			} else if (svar < medel) {

				gisnigar--;

				System.out.println("h�gre du har " + gisnigar + " gisnigar kvar");

			}
			if (gisnigar == 0) {

				exit = true;
				System.out.println("du mislykades svaret var" + medel);
			}

		}

	}
	/**
	 * tar in l�ng sv�r
	 * @param l�tt
	 * kolar om svar �r ett giltit (try/catch)
	 * kollar om svar �t = l�tt.
	 * koden slurar n�r svar = sv�r eller gisnigar = 0. 
	 */

	public static void sv�raste(long sv�r) {

		int svar = 0;

		int gisnigar = 5;

		boolean exit = false;

		while (!exit) {

			boolean validInput = false;
			while (!validInput) {
				try {
					svar = input.nextInt();
					validInput = true;
						
					} catch (Exception e) {
						input.nextLine();
						System.out.println("svara med en sifra ");
					}
			}

			if (svar == sv�r) {
				exit = true;
				System.out.println("du har r�tt svaret var " + sv�r);

			}

			else if (svar > sv�r) {

				gisnigar--;

				System.out.println("l�gre du har " + gisnigar + " gisnigar kvar");

			} else if (svar < sv�r) {

				gisnigar--;

				System.out.println("h�gre du har " + gisnigar + " gisnigar kvar");

			}
			if (gisnigar == 0) {

				exit = true;
				System.out.println("du mislykades svaret var" + sv�r);
			}

		}

	}

}
