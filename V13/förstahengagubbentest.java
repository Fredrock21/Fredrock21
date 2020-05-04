import java.util.ArrayList;
import java.util.Scanner;

public class förstahengagubbentest {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean spel = false;
		while (!spel) {

		
		String[] ord = {"lo","oxe","cat","örn","björn","varg"
				,"hund","lax","räv","uggla","råtta"};
		
		 
		String orddet = ord[(int)(Math.random()*10)];
		
		System.out.println("Detta är hängagubbe du ska gissa rätt på ett ord.");
		System.out.println("Skriv in en bokstav och om den finns i ordet kommer du se det.");
		System.out.println("Om du gissar fel kommer gubben örja hängas");
		System.out.println("När gubben är hängd har du förlorat.");
		System.out.println("För att vinna måste du visa alla bokstäver i ordet.");
		System.out.println("Skriv inte mer än en bokstav i taget");

		
		
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
			System.out.println("okej ha de gött");
			spel = true;
		}
	}
		
		
	}
	public static void Gissa(ArrayList<Character> ordLista) {
		
		boolean försök = false;
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
		
		while(!försök){
			String giss = input.nextLine().toLowerCase().trim();
			
			miss = 0;
			
			System.out.println(giss);
			
			

			
			if(giss.length() != 1){
				
				System.out.println("skriv inte feller bokstäver");
				System.out.println("försök i gen");
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
					 
					 försök = true;
					 
					 
				}
				if(lykanden == antalord) {
					försök = true;
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
	
