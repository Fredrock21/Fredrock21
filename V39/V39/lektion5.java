package V39;

import java.util.Scanner;

public class lektion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
			// Anv�nds n�r man vet exakt hur m�nga g�nger man vill repetera n�got
			
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
			
			}

	}
