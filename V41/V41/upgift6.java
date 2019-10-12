package V41;

import java.util.Scanner;

public class upgift6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double pi = 3.14; 
		
		System.out.println("skriv in höjden på din sylide");
		double h = input.nextInt();
		
		System.out.println("skriv in breden på din sylide");
		double b = input.nextInt();
		
		double r = b/2;
		
		System.out.println("volymen på syliden är");
		System.out.println(pi*r*r*h);

	}

}
