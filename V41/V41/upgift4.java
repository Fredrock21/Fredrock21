package V41;

import java.util.Scanner;

public class upgift4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int tal;
		int sum = 1;
		int i = 0;
		
		while(sum <= 99999 && i != 10) {
			tal = input.nextInt();
			i += 1;
			sum *= tal;
			
		}
		
		System.out.println(sum+" prudukt");
		System.out.println(i+" mengd tal");

	}

}
