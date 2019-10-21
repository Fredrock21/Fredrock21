package V43;

import java.util.Scanner;

public class Letion7 {

	public static void main(String[] args) {
		
		
		int tal1;
		int tal2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("vänligen skriv in två hel tall");
		
		tal1 = input.nextInt();
		tal2 = input.nextInt();
		
		System.out.println(minstatal(tal1, tal2));
		
	
		}
	public static String minstatal(int tal3, int tal4) {
	
		if(tal3 <= tal4) {
		System.out.println("minsra talet är:" + tal3);
	}

	else {
		System.out.println("minsra talet är:" + tal4);
	}
	String hej = "metoden är klar";
	
	return hej;
	}

}
