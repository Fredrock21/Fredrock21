package V43;

import java.util.Scanner;

public class Lexa5�verl�vet {

	public static void main(String[] args) {
		
		System.out.println(LoL());
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("skriv in tv� heltal och du kommer f� tilbaka det st�rsta.");
		
		int tala;
		int talb;
		int taln;
		double kelvin;
		double fahrenheit;
		int age;
		int steps;
		
		
		tala = input.nextInt();
		talb = input.nextInt();
		
		System.out.println(max(tala, talb));
		
		System.out.println("skriv in ett tal f� denns tal f�ljd");
		
		taln = input.nextInt();
		
		System.out.println("skriv en grad i kelvin och f� tilbaki i celsius.");
		
		kelvin = input.nextInt();
		
		System.out.println(kelvinToCelsius(kelvin));
		
		System.out.println("skriv en temptatu i farenhait och f� tilbaka den i celsius");
		
		fahrenheit = input.nextInt();
		
		System.out.println(fahrenheitToCelsius(fahrenheit));
		
		System.out.println("skriv din older och f� reda p� vad du f�r dit �de");
		
		age = input.nextInt();
		
		System.out.println("g�t en trapa ut av X");
		
		steps = input.nextInt();
	}
	
	public static String LoL() {
		
		String lol ="HAHAHAHAHAHAHAHAHAHA";
		
		return lol;
		
		}
	public static int max(int tala, int talb){
		
		if (tala <= talb) {
			return talb;
		}
		else {
			return tala;
		}
		
	}
	public static void cnunt(int taln) {
		
		for (int i = 0; i < taln; i++) {
			
			System.out.println(i);

			}	
	}
	public static double kelvinToCelsius(double kelvin) {
		
		double Celius = kelvin - 273.15;
		
		return Celius;
		 
		
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		
		double celisius = (fahrenheit - 32)/1.8;
		
		return celisius;
		
	}
	public static void ageControl(int age) {
		
		if (age <= 5) {
			System.out.println("m�barn f�r inte g�ra n�got.");
		}
		else if (age >= 6 && age < 12){
			System.out.println("Du f�r spela Fortnite.");
		}
		else if (age >= 13 && age <= 14){
			System.out.println("Du �r ton�ring.");
		}
		else if (age >= 15 && age <= 17){
			System.out.println("Du f�r k�ra moppe.");
		}
		else if (age >= 18 && age <= 20){
			System.out.println("Du f�r k�ra bil.");
		}
		else if (age >= 21 && age <= 64){
			System.out.println("Du f�r vuxenstraff om du g�r n�got dumt.");
		}
		else if (age >= 65 && age <= 99){
			System.out.println("Du �r pension�r.");
		}
		else if (age <= 100){
			System.out.println("R.I.P?");
		}
		
	}public static void stair(int steps){
		
		for (int i = 1; i <= steps; i++) {
			
			for(int N = 0; N < i; N++) {
				
				System.out.print("x");
			
			}
			System.out.println();
		}

	}

}
	
	
	

