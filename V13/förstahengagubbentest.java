import java.util.ArrayList;
import java.util.Scanner;

public class f�rstahengagubbentest {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean spel = false;
		while (!spel) {

		
		String[] ord = {"lo","oxe","cat","�rn","bj�rn","varg"
				,"hund","lax","r�v","uggla","r�tta"};
		
		 
		String orddet = ord[(int)(Math.random()*10)];
		
		System.out.println("Detta �r h�ngagubbe du ska gissa r�tt p� ett ord.");
		System.out.println("Skriv in en bokstav och om den finns i ordet kommer du se det.");
		System.out.println("Om du gissar fel kommer gubben �rja h�ngas");
		System.out.println("N�r gubben �r h�ngd har du f�rlorat.");
		System.out.println("F�r att vinna m�ste du visa alla bokst�ver i ordet.");
		System.out.println("Skriv inte mer �n en bokstav i taget");

		
		
		ArrayList<Character> ordLista = new ArrayList<Character>();
		
		for (int i = 0; i < orddet.length(); i++) {
			
			ordLista.add(orddet.charAt(i));
			
		}
		
		Gissa(ordLista);
		
		System.out.println("orddet var " + orddet);
		
		
		System.out.println("skriv ja om du vill solea igen"
				+ " anars klikan vidare");
		String J;
		input.nextLine();
		
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
	public static void Gissa(ArrayList<Character> ordLista) {
		
		boolean f�rs�k = false;
		int mislykaden = 0;
		int antalord = 0;
		int lykanden = 0;
		int miss = 0;
		
		for (int i = 0; i < ordLista.size(); i++) {
			antalord = i+1;	
		}
		
		
		ArrayList<Character> falskordLista = new ArrayList<Character>();
		
		for (int i = 0; i < antalord; i++) {
			falskordLista.add('_');
		}
		
		while(!f�rs�k){
			String giss = input.nextLine().toLowerCase().trim();
			
			miss = 0;
			
			System.out.println(giss);
			
			

			
			if(giss.length() != 1){
				
				System.out.println("skriv inte feller bokst�ver");
				System.out.println("f�rs�k i gen");
				continue;
			}
			else {
				
			
			for (int i = 0; i < ordLista.size(); i++) {
				
				if(giss.charAt(0) == falskordLista.get(i)){
				
					lykanden--;
					System.out.println("Skriv inte samma ord 2 gonger");
					
					
				}
				
				if(giss.charAt(0) == ordLista.get(i)) {
				
				  lykanden++;
				  
				  falskordLista.remove(i);
				  
				  falskordLista.add(i, giss.charAt(0));
					
				}
				else {
					miss ++;
				}
				
					
				
			}
			}
			
			if(miss == antalord) {
				
				mislykaden++;
				
				aski(mislykaden);
				
			}
			
			
				if(mislykaden == 7) {
					 System.out.println("du mislykades");
					 
					 f�rs�k = true;
					 
					 
				}
				if(lykanden == antalord) {
					f�rs�k = true;
					System.out.println("du lykades");
					
				}
			
				System.out.println(falskordLista);
			

				
			}
			
			
			
	}
	
	public static void aski(int mislykaden) {
		
		if(mislykaden == 1) {
			System.out.println(""
					+ "  +---+\r\n" + 
					"  |   |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"=========''', '''");
			
		}
		if(mislykaden == 2) {
			System.out.println(""
					+ "  +---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"=========''', '''");		
		}
		if(mislykaden == 3) {
			System.out.println(""
					+ "  +---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					"  |   |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"=========''', '''");
		}
		if(mislykaden == 4) {
			System.out.println(""
					+ "  +---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					" /|   |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"=========''', '''");
		}
		if(mislykaden == 5) {
			System.out.println(""
					+ "  +---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					" /|\\  |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"=========''', '''");
		}
		if(mislykaden == 6) {
			System.out.println(""
					+ "+---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					" /|\\  |\r\n" + 
					" /    |\r\n" + 
					"      |\r\n" + 
					"=========''', '''");
		}
		if(mislykaden == 7) {
			System.out.println(""
					+ "+---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					" /|\\  |\r\n" + 
					" / \\  |\r\n" + 
					"      |\r\n" + 
					"=========''']");			
		}
		
		
		
		
	}


		
}
	
