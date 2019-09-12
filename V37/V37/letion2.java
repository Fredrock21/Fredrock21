package V37;

import java.util.Scanner;

public class letion2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String namn1 = "Tomas Weis";
		String namn2 = "Fredrik Nilsson";
		String namn3 = "Linsus Lindström";
		
		System.out.println("skriv dit namn");
		
		String namn4 = input.nextLine();
		
		System.out.println("skriv en kopis namn");
		
		String namn5 = input.nextLine();
		
		System.out.print("\nNAMN:\t");
		System.out.println(namn1 + "\n" + namn2 + "\n" + namn3 + "\n" + namn4 + "\n" + namn5);
		
		
	}
	
}

