import java.util.ArrayList;
import java.util.Scanner;

public class f�rstahengagubbentest {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int choice = 0;
		System.out.println("Detta �r spelet H�nga gubben");
		System.out.println("Vet du hur man g�r? V�lj genom att klicka 1,2 eller 3.");

		System.out.println("[1] Nej! ");
		System.out.println("[2] Ja, men jag vill ha instruktionen igen ");
		System.out.println("[3] Ja och jag vet hur man g�r.");
		System.out.println();

		boolean menyn = false;

		while (!menyn) {

			try {
				choice = input.nextInt();

			} catch (Exception e) {
				input.nextLine();
				System.out.println("skriv in 1,2 eller 3 ");
			}

			meny(choice);

			if (choice == 1 || choice == 2 || choice == 3) {
				menyn = true;
			}

		}

		input.nextLine();

		boolean spel = false;
		while (!spel) {

			String[] ord = { "lo", "oxe", "katt", "�rn", "bj�rn", "varg", "hund", "lax", "r�v", "uggla", "r�tta" };

			String orddet = ord[(int) (Math.random() * 10)];

			ArrayList<Character> ordLista = new ArrayList<Character>();

			for (int i = 0; i < orddet.length(); i++) {

				ordLista.add(orddet.charAt(i));

			}

			Gissa(ordLista);

			System.out.println("ordet var " + orddet);

			System.out.println("skriv ja om du vill spela igen" + " annars klicka vidare");
			String J;

			J = input.nextLine();

			if (J.equals("ja")) {
				System.out.println("bra");

			}

			else {
				System.out.println("okej ha de g�tt");
				spel = true;
			}
		}

	}
/**
 * impoterar choice och veljer case beroede de
 * 
 * @param choice
 */
	public static void meny(int choice) {

		switch (choice) {

		case 1:
			System.out.println("Du ska ta reda p� det hemliga ordet ");
			System.out.println("innan gubben h�ngs. V�lj en bokstav i");
			System.out.println("taget, du f�r svar direkt om det �r r�tt.");
			System.out.println("Om du har fel b�rjar gubben h�ngas.");
			System.out.println("Du vinner om du f�r fram hela ordet innan");
			System.out.println("gubben d�r.");

			break;

		case 2:
			System.out.println("Du ska ta reda p� det hemliga ordet ");
			System.out.println("innan gubben h�ngs. V�lj en bokstav i");
			System.out.println("taget, du f�r svar direkt om det �r r�tt.");
			System.out.println("Om du har fel b�rjar gubben h�ngas.");
			System.out.println("Du vinner om du f�r fram hela ordet innan");
			System.out.println("gubben d�r.");

			break;

		case 3:
			System.out.println("ok lycka till!");

			break;

		default:

			System.out.println("det finns bara 3 m�jligheter");

			break;

		}

	}

	/**
	 * Metoden kolar om Gissnigen �r giltig eller inte. 
	 * 
	 * @param ordLista
	 */
	public static void Gissa(ArrayList<Character> ordLista) {

		boolean f�rs�k = false;
		int mislykaden = 0;
		int antalord = 0;
		int lykanden = 0;
		int miss = 0;

		for (int i = 0; i < ordLista.size(); i++) {
			antalord = i + 1;
		}

		ArrayList<Character> falskordLista = new ArrayList<Character>();

		for (int i = 0; i < antalord; i++) { // skapar en array med bara "_"
			falskordLista.add('_');
		}
		
		ArrayList<Character> gisnigslista = new ArrayList<Character>();

		while (!f�rs�k) {

			String giss = input.nextLine().toLowerCase().trim();
			// tar f�rst bort mellan slagen runt om 
			// sen endrar alla till sm� bokst�ver 

			miss = 0;

			if (giss.length() != 1) { // kollar s� inte giss har fler karakt�rer

				System.out.println("skriv inte feller bokst�ver");
				System.out.println("f�rs�k i gen");
				continue;
			} else {

				for (int i = 0; i < ordLista.size(); i++) {

					if (giss.charAt(0) == falskordLista.get(i)) {

						lykanden--;
						System.out.println("Skriv inte samma ord 2 gonger");

					}

					if (giss.charAt(0) == ordLista.get(i)) {
						// l�ger in karakt�ren p� r�tt palt i understreks tabeln.

						lykanden++;

						falskordLista.remove(i);

						falskordLista.add(i, giss.charAt(0));

					} else {
						miss++;
					}

				}
			}

			if (miss == antalord) {

				mislykaden++;

				aski(mislykaden);
				dinagissnigar(gisnigslista, giss);
			}
			
			

			if (mislykaden == 7) {

				System.out.println("du misslyckades");

				f�rs�k = true;

			}
			if (lykanden == antalord) {
				f�rs�k = true;
				System.out.println("du lyckades");

			}

			System.out.println(falskordLista);

		}

	}
	/**
	 * importerar en array lista och leger in felsvaren i listan.
	 * 
	 * @param gisnigslista
	 * @param giss
	 */
	public static void dinagissnigar(ArrayList<Character> gisnigslista, String giss) {	
		
		int j = 0;
		
		for (int i = 0; i < gisnigslista.size(); i++) {
			
			if(giss.charAt(0) == gisnigslista.get(i) ) {
				j++;
			}
		}
		
		if(j > 0){
			
		}
		else {
		gisnigslista.add(giss.charAt(0));
	}
		
		System.out.println("du har gisat fel p�");
		System.out.println(gisnigslista);
		
		
	}
	

	/**
	 * Tar in en int och ritar ret aski bild.
	 * 
	 * @param mislykaden
	 */
	public static void aski(int mislykaden) {

		if (mislykaden == 1) {
			System.out.println("" + "  +---+\r\n" + "  |   |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
					+ "      |\r\n" + "=========''', '''");

		}
		if (mislykaden == 2) {
			System.out.println("" + "  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "      |\r\n" + "      |\r\n"
					+ "      |\r\n" + "=========''', '''");
		}
		if (mislykaden == 3) {
			System.out.println("" + "  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "  |   |\r\n" + "      |\r\n"
					+ "      |\r\n" + "=========''', '''");
		}
		if (mislykaden == 4) {
			System.out.println("" + "  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|   |\r\n" + "      |\r\n"
					+ "      |\r\n" + "=========''', '''");
		}
		if (mislykaden == 5) {
			System.out.println("" + "  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + "      |\r\n"
					+ "      |\r\n" + "=========''', '''");
		}
		if (mislykaden == 6) {
			System.out.println("" + "  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /    |\r\n"
					+ "      |\r\n" + "=========''', '''");
		}
		if (mislykaden == 7) {
			System.out.println("" + "  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " / \\  |\r\n"
					+ "      |\r\n" + "=========''']");
		}

	}

}
