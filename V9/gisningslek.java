
import java.util.Scanner;

public class gisningslek {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("I deta spelet ska du gisa ett tall mellan n�gra interval du f�r 5 f�rs�k p� dig! V�lj sv�righets grad");
		System.out.println("[1] l�tt 1-10");
		System.out.println("[2] mellan 1-100");
		System.out.println("[3] sv�r 1-1000");
		System.out.println();
		
		int choice;
		
		choice = input.nextInt();
 
		switch (choice) {
		case 1:
			System.out.println("du valde l�tt");
			long l�tt = Math.round((Math.random()*10));
			
			System.out.println(l�ttaste(l�tt));
			
			break;
 
		case 2:
			System.out.println("du valde mellan");
			long medel = Math.round((Math.random()*100));
			
			System.out.println(mellan(medel));
 
			break;
 
		case 3:
 
			System.out.println("du valde sv�r");
			long sv�r = Math.round((Math.random()*1000));
			
			System.out.println(sv�raste(sv�r));
			
			break;
 
		default:
			
			System.out.println("du har inte valt en sv�righetsgard :(");
			
			break;
			
		}
	}
	public static void l�ttaste(long l�tt) {
		

		int svar;
		
		int gisnigar = 5;
		
		boolean exit = false;
		
		while (!exit){
		
			svar = input.nextInt();
		
		if (svar == l�tt) {
			exit = true;
			System.out.println("du har rett de arr " + l�tt);
			
		}
		
		else if (svar > l�tt) {
			
			gisnigar--;
			
			System.out.println("l�gre du har " + gisnigar + " gisnigar kvar");
			
		}
		else if (svar < l�tt) {
			
			gisnigar--;
			
			System.out.println("h�gre du har " + gisnigar + " gisnigar kvar");
			
		}
		if (gisnigar == 0) {
			
			exit = true;
			System.out.println("du mislykades inga gisnaigar kavr");
		}
			
			
		}
		
		

	}
	
	
	public static void mellan(long medel) {
		
	int svar;
		
		int gisnigar = 5;
		
		boolean exit = false;
		
		while (!exit){
		
			svar = input.nextInt();
		
		if (svar == medel) {
			exit = true;
			System.out.println("du har rett de arr " + l�tt);
			
		}
		
		else if (svar > medel) {
			
			gisnigar--;
			
			System.out.println("l�gre du har " + gisnigar + " gisnigar kvar");
			
		}
		else if (svar < medel) {
			
			gisnigar--;
			
			System.out.println("h�gre du har " + gisnigar + " gisnigar kvar");
			
		}
		if (gisnigar == 0) {
			
			exit = true;
			System.out.println("du mislykades inga gisnaigar kavr");
		}
			
			
		}
		
	}
	
	public static void sv�raste(long sv�r) {
		
		int svar;
		
		int gisnigar = 5;
		
		boolean exit = false;
		
		while (!exit){
		
			svar = input.nextInt();
		
		if (svar == sv�r) {
			exit = true;
			System.out.println("du har rett de arr " + l�tt);
			
		}
		
		else if (svar > sv�r) {
			
			gisnigar--;
			
			System.out.println("l�gre du har " + gisnigar + " gisnigar kvar");
			
		}
		else if (svar < sv�r) {
			
			gisnigar--;
			
			System.out.println("h�gre du har " + gisnigar + " gisnigar kvar");
			
		}
		if (gisnigar == 0) {
			
			exit = true;
			System.out.println("du mislykades inga gisnaigar kavr");
		}
			
			
		}
		
	}



}
