package V39;

import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int R1 = input.nextInt();
		int S = input.nextInt();
		
		int R2 = (S*2 - R1);
		System.out.println(R2);
	}

}
