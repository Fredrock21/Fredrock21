	package lekton;
	
	import java.util.Scanner;
	
	public class lekton3 {
	
		public static void main(String[] args) {
			// villkor
			boolean agein = true;
			int svar = 1;
			int age = 0; // initierat variabel
			boolean reapeat = true;
	
			Scanner input = new Scanner(System.in); // g�r det
			
			while (reapeat)
	 
			if (agein) {
	
				System.out.println("hur gammal �r du");
				age = input.nextInt();
	
				if (age > 99) {
					System.out.println("Gratulerar du f�r k�ra rumdraket");
					System.out.println("plus bil och m�ped... men v�rkligen");
				}
	
				if (age >= 18 && age < 80) {
	
					System.out.println("skafa bil och k�r p�");
					System.out.println("du kan �ka moped ocks�");
	
				} else if (age > 14 && age < 18) {
					System.out.println("du kan k�ra m�pe men inte bil");
				} else {
					System.out.println("nu f�r du inte k�ra n�got");
				}
	
			}
		}
	
	}
