
import java.util.Scanner;

public class gisningslek {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {		

		System.out.println(
				"I deta spelet ska du gisa ett tall mellan några interval du får 5 försök på dig! Välj svårighets grad");
		boolean success = false;
		while (!success) {

			System.out.println("[1] lätt 1-10");
			System.out.println("[2] mellan 1-100");
			System.out.println("[3] svår 1-1000");
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
				System.out.println("du valde lätt");
				long lätt = Math.round((Math.random() * 10));

				lättaste(lätt);

				break;

			case 2:
				System.out.println("du valde mellan");
				long medel = Math.round((Math.random() * 100));

				mellan(medel);

				break;

			case 3:

				System.out.println("du valde svår");
				long svår = Math.round((Math.random() * 1000));

				svåraste(svår);

				break;

			default:

				System.out.println("du har inte valt en svårighetsgard :(");

				break;

			}
			
			String J;
			System.out.println("vill du spela i gen?");
			System.out.println("skriv ja om du vill fortsäta");
			
			input.nextLine();// går till nesta rad 
			
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
	 * tar in lång lätt
	 * @param lätt
	 * kolar om svar är ett giltit (try/catch)
	 * kollar om svar ät = lätt.
	 * koden slurar när svar = lätt eller gisnigar = 0. 
	 */
	public static void lättaste(long lätt) {

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
			

			if (svar == lätt) {
				exit = true;
				System.out.println("du har rätt de svaret var " + lätt);

			}

			else if (svar > lätt) {

				gisnigar--;

				System.out.println("lägre du har " + gisnigar + " gisnigar kvar");

			} else if (svar < lätt) {

				gisnigar--;

				System.out.println("högre du har " + gisnigar + " gisnigar kvar");

			}
			if (gisnigar == 0) {

				exit = true;
				System.out.println("du mislykades svaret var " + lätt);
			}

		}

	}
	/**
	 * tar in lång medel
	 * @param lätt
	 * kolar om svar är ett giltit (try/catch)
	 * kollar om svar ät = lätt.
	 * koden slurar när svar = medel eller gisnigar = 0. 
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
				System.out.println("du har rätt de svaret var " + medel);

			}

			else if (svar > medel) {

				gisnigar--;

				System.out.println("lägre du har " + gisnigar + " gisnigar kvar");

			} else if (svar < medel) {

				gisnigar--;

				System.out.println("högre du har " + gisnigar + " gisnigar kvar");

			}
			if (gisnigar == 0) {

				exit = true;
				System.out.println("du mislykades svaret var " + medel);
			}

		}

	}
	/**
	 * tar in lång svår
	 * @param lätt
	 * kolar om svar är ett giltit (try/catch)
	 * kollar om svar ät = lätt.
	 * koden slurar när svar = svår eller gisnigar = 0. 
	 */

	public static void svåraste(long svår) {

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

			if (svar == svår) {
				exit = true;
				System.out.println("du har rätt svaret var " + svår);

			}

			else if (svar > svår) {

				gisnigar--;

				System.out.println("lägre du har " + gisnigar + " gisnigar kvar");

			} else if (svar < svår) {

				gisnigar--;

				System.out.println("högre du har " + gisnigar + " gisnigar kvar");

			}
			if (gisnigar == 0) {

				exit = true;
				System.out.println("du mislykades svaret var " + svår);
			}

		}

	}

}
