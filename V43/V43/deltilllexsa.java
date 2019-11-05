package V43;

import java.util.Scanner;

public class deltilllexsa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int steps;
		
		steps = input.nextInt();
		
		for (int i = 1; i <= steps; i++) {
			
			for(int N = 0; N < steps; N++) {
				if(N < steps-i ) {
					System.out.print(" ");
				}
				else if (N >= steps-i) {
					System.out.print("X");
				}
				
				
			}	
			System.out.println();
		
		}

	}
}


