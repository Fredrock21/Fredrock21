
import java.util.Scanner;

public class gisningslek {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("I deta spelet ska du gisa ett tall mellan några interval du får 5 försök på dig! Välj svårighets grad");
		System.out.println("[1] lätt 1-10");
		System.out.println("[2] mellan 1-100");
		System.out.println("[3] svår 1-1000");
		System.out.println();
		
		int choice;
		
		choice = input.nextInt();
 
		switch (choice) {
		case 1:
			System.out.println("du valde lätt");
			long lätt = Math.round((Math.random()*10));
			
			System.out.println(lättaste(lätt));
			
			break;
 
		case 2:
			System.out.println("du valde mellan");
			long medel = Math.round((Math.random()*100));
			
			System.out.println(mellan(medel));
 
			break;
 
		case 3:
 
			System.out.println("du valde svår");
			long svår = Math.round((Math.random()*1000));
			
			System.out.println(svåraste(svår));
			
			break;
 
		default:
			
			System.out.println("du har inte valt en svårighetsgard :(");
			
			break;
			
		}
	}
	public static void lättaste(long lätt) {
		

		int svar;
		
		int gisnigar = 5;
		
		boolean exit = false;
		
		while (!exit){
		
			svar = input.nextInt();
		
		if (svar == lätt) {
			exit = true;
			System.out.println("du har rett de arr " + lätt);
			
		}
		
		else if (svar > lätt) {
			
			gisnigar--;
			
			System.out.println("lägre du har " + gisnigar + " gisnigar kvar");
			
		}
		else if (svar < lätt) {
			
			gisnigar--;
			
			System.out.println("högre du har " + gisnigar + " gisnigar kvar");
			
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
			System.out.println("du har rett de arr " + lätt);
			
		}
		
		else if (svar > medel) {
			
			gisnigar--;
			
			System.out.println("lägre du har " + gisnigar + " gisnigar kvar");
			
		}
		else if (svar < medel) {
			
			gisnigar--;
			
			System.out.println("högre du har " + gisnigar + " gisnigar kvar");
			
		}
		if (gisnigar == 0) {
			
			exit = true;
			System.out.println("du mislykades inga gisnaigar kavr");
		}
			
			
		}
		
	}
	
	public static void svåraste(long svår) {
		
		int svar;
		
		int gisnigar = 5;
		
		boolean exit = false;
		
		while (!exit){
		
			svar = input.nextInt();
		
		if (svar == svår) {
			exit = true;
			System.out.println("du har rett de arr " + lätt);
			
		}
		
		else if (svar > svår) {
			
			gisnigar--;
			
			System.out.println("lägre du har " + gisnigar + " gisnigar kvar");
			
		}
		else if (svar < svår) {
			
			gisnigar--;
			
			System.out.println("högre du har " + gisnigar + " gisnigar kvar");
			
		}
		if (gisnigar == 0) {
			
			exit = true;
			System.out.println("du mislykades inga gisnaigar kavr");
		}
			
			
		}
		
	}



}
