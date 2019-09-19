package lekton;

import java.util.Scanner;

public class lexsa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double tal1;
		double tal2;
		double tal3;
		double tal4;
		double tal5;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("skriv ner 5 heltal mellan 1 och 9 utan desimaler, tack.");
		
		tal1 = input.nextInt();
		tal2 = input.nextInt();
		tal3 = input.nextInt();
		tal4 = input.nextInt();
		tal5 = input.nextInt();
		
		if (tal1 >= tal2 && tal1 >= tal3 && tal1 >= tal4 && tal1 >= tal5) { 
			
			System.out.println("\nHögst:\t");
			System.out.println(tal1 +"");	
		
		}
		else if (tal2 >= tal1 && tal2 >= tal3 && tal2 >= tal4 && tal2 >= tal5) { 
			
			System.out.println("\nHögst:\t");
			System.out.println(tal2 +"");	
		
		}
		else if (tal3 >= tal1 && tal3 >= tal2 && tal3 >= tal4 && tal3 >= tal5) { 
			
			System.out.println("\nHögst:\t");
			System.out.println(tal3 +"");	
		

		}
		else if (tal4 >= tal1 && tal4 >= tal2 && tal4 >= tal3 && tal4 >= tal5) { 
			
			System.out.println("\nHögst:\t");
			System.out.println(tal4 +"");	
		
	}
		else if (tal5 >= tal1 && tal5 >= tal3 && tal5 >= tal4 && tal5 >= tal2) { 
		
		System.out.println("\nHögst:");
		System.out.println(tal5 +"");
		}
		
		if (tal1 <= tal2 && tal1 <= tal3 && tal1 <= tal4 && tal1 <= tal5) { 
			
			System.out.println("\nLägst:\t");
			System.out.println(tal1 +"");	
		
		}
		else if (tal2 <= tal1 && tal2 <= tal3 && tal2 <= tal4 && tal2 <= tal5) { 
			
			System.out.println("\nlägst:\t");
			System.out.println(tal2 +"");	
		
		}
		else if (tal3 <= tal1 && tal3 <= tal2 && tal3 <= tal4 && tal3 <= tal5) { 
			
			System.out.println("\nlägst:\t");
			System.out.println(tal3 +"");	
		

		}
		else if (tal4 <= tal1 && tal4 <= tal2 && tal4 <= tal3 && tal4 <= tal5) { 
			
			System.out.println("\nlägst:\t");
			System.out.println(tal4 +"");	
		
	}
		else if (tal5 <= tal1 && tal5 <= tal3 && tal5 <= tal4 && tal5 <= tal2) { 
		
		System.out.println("\nlägst:\t");
		System.out.println(tal5 +"");
		}
		
		System.out.println("\nMedian:");
		System.out.println((tal1 + tal2 + tal3 + tal4 + tal5)/5);
	}
}