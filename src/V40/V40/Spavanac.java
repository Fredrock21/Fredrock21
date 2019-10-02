package V40;

import java.util.Scanner;

public class Spavanac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		int H = input.nextInt();
		int M = input.nextInt(); 
		int M1 = M-45 ;

		
		if (H >= 0 && M1 >= 0) {
		
		System.out.println(H+" "+M1);
		}
		
		if (H > 0 && M1 < 0){

			H -= 1;
			M=M1+60;
			System.out.println(H+" "+M);
		}
		if (H == 0 && M1 <= 0)
			
			M = M1+60;
		System.out.println(23+" "+M);
		
		}
	}


