package V41;

import java.util.Scanner;

public class upgift5test2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i = 0; i < 10000; i++) {
			
			if(i % 7 == 0) { 
				
				sum += i;
				
				System.out.println(sum);
			}
		}

	}

}
