package V39;

import java.util.Scanner;

public class lektion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
			// Används när man vet exakt hur många gånger man vill repetera något
			
			// Skriver ut 0-4
		int summa=0;
			for (int tal = 0; tal < 100; tal++) {
				summa+=tal;	
				}
			System.out.println(summa);
			
			for (int i = 25; i < 51; i++) {
				System.out.println(i);			
			}
			
			for (int i = 20 ; i > 0; i--) {
				System.out.println(i);
			}
			System.out.println("skriv ett helatal under 10");
			
			int tal = input.nextInt();
			int prudukt = 0 ;
			
			for (int i = 0 ; i <= 10 ;i++) {
				prudukt = tal*i;
				System.out.println(prudukt);

				}
			boolean exit = false;
			
			while(!exit){
				
				int sifra = input.nextInt();
				int allasifror = 0;
				
						System.out.println("sifra");
				allasifror+=sifra;
				
				if (sifra == 0){
					exit = true;
			}
				System.out.println(allasifror);
		}
			
			
	}
}
