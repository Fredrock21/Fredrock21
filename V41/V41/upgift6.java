package V41;

import java.util.Scanner;

public class upgift6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double pi = 3.14; 
		
		System.out.println("skriv in h�jden p� din sylide");
		double h = input.nextInt();
		
		System.out.println("skriv in breden p� din sylide");
		double b = input.nextInt();
		
		double r = b/2;
		
		System.out.println("volymen p� syliden �r");
		System.out.println(pi*r*r*h);

	}

}
