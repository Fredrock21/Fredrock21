package V39;

import java.util.Scanner;

public class StuckInATimeLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
			for (int i = 1; i <= N; i++) {
			
			System.out.println(i + "\tAbracadabra");			
		}
	}

}
