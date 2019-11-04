package V43;

import java.util.Scanner;

public class Letion7 {
 
	public static void main(String[] args) {
		twoNumbers();
		
		}
	/**
	 * Skriver två heltal och sikar vidare.
	 */
	
	public static void twoNumbers(){
		int tal1;
		int tal2;
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("vänligen skriv in två hel tall");
		
		tal1 = input.nextInt();
		tal2 = input.nextInt();
		
		System.out.println(minstatal(tal1, tal2));
		
		
	}
	/**
	 * Jämför två tal och skriver viket som är minst. 
	 * Och jer tlibaka en helsining.
	 * @param tal3
	 * @param tal4
	 * @return String hej++
	 */
	public static String minstatal(int tal3, int tal4) {
	
		if(tal3 <= tal4) {
		System.out.println("minsra talet är:" + tal3);
	}

	else {
		System.out.println("minsra talet är:" + tal4);
	}
	String hej = "pogramet är färdigt";
	
	return hej;
	}

}
