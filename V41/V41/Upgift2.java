package V41;

import java.util.Scanner;

public class Upgift2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int tal = input.nextInt();
		int tusental = 0;
		int hundratal = 0;
		int tiotal = 0;
		int ental = 0;
		
		tusental = (tal / 1000);
		System.out.println(tusental);
		
		hundratal = ((tal- tusental*1000)/100);
		System.out.println(hundratal);
		
		tiotal = ((tal-tusental*1000 -hundratal*100)/10);
		System.out.println(tiotal);
		
		ental = ((tal-tusental*1000 -hundratal*100 -tiotal*10)/1);
		System.out.println(ental);
		
		System.out.println(tusental+hundratal+tiotal+ental);
		
				
		
		
	
	
	
	}

}
