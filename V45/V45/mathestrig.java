package V45;

import java.util.Scanner;

public class mathestrig {

	public static void main(String[] args) {
		
		double svar = Math.sqrt((Math.pow(3, 2)+4));
		
		System.out.println(svar);
		
		System.out.println(Math.max(5, 6));
		
		String mening = "Tomas är där";
		System.out.println(mening);
		
		Scanner input = new Scanner(System.in);
		
		String mening2 = input.nextLine();
		
		if(mening.equals(mening2)) {
			System.out.println("samma mening");
		}
		System.out.println(mening.length());
		System.out.println(mening.toUpperCase());
		System.out.println("TomAs kan inte Stava".toLowerCase());
		System.out.println("Tomas är här".contains("Tomas"));
		System.out.println("        Tomas är här".trim());
		System.out.println("        Tomas är här".trim().toLowerCase());
		System.out.println("Tomas är där".replace('T', 'B'));
		int a =7;
		int b = 3;

		double anwswe = (double) a / (double) b;
		System.out.println(anwswe);
		
	}

}
