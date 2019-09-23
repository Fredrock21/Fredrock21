	package lekton;
	
	import java.util.Scanner;
	
	public class lekton3 {
	
		public static void main(String[] args) {
			// villkor
			boolean agein = true;
			int svar = 1;
			int age = 0; // initierat variabel
			boolean reapeat = true;
	
			Scanner input = new Scanner(System.in); // gör det
			
			while (reapeat)
	 
			if (agein) {
	
				System.out.println("hur gammal är du");
				age = input.nextInt();
	
				if (age > 99) {
					System.out.println("Gratulerar du får köra rumdraket");
					System.out.println("plus bil och måped... men värkligen");
				}
	
				if (age >= 18 && age < 80) {
	
					System.out.println("skafa bil och kör på");
					System.out.println("du kan åka moped också");
	
				} else if (age > 14 && age < 18) {
					System.out.println("du kan köra måpe men inte bil");
				} else {
					System.out.println("nu får du inte köra något");
				}
	
			}
		}
	
	}
