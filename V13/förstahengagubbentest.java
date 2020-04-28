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
		
		System.out.println(orddet);
		
		ArrayList<Character> ordLista = new ArrayList<Character>();
		
		for (int i = 0; i < orddet.length(); i++) {
			
			ordLista.add(orddet.charAt(i));
			
		}
		
		Gissa(ordLista);
		
		System.out.println("orddet var " + orddet);
		String J;
		System.out.println("skriv ja om du vill solea igen"
				+ " anars klikan vidare");
		
		
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
		System.out.println(antalord);
		
		ArrayList<Character> falskordLista = new ArrayList<Character>();
		
		for (int i = 0; i < antalord; i++) {
			falskordLista.add('_');
		}
		
		while(!försök){
			String giss = input.next().toLowerCase();
			
			
			
			miss = 0;
		
			
			for (int i = 0; i < ordLista.size(); i++) {
				
				if(giss.charAt(0) == falskordLista.get(i)){
				
					lykanden--;
					System.out.println("Skriv inte samma ord 2 onger");
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
	
