package V39;

import java.util.Scanner;

public class QuadrantSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		if(x>0 && y>0){
			System.out.println("Quadrant 1");
		}
		if(x<0 && y>0){
			System.out.println("Quadrant 2");
		}
		if(x<0 && y<0){
			System.out.println("Quadrant 3");
		}
		if(x>0 && y<0){
			System.out.println("Quadrant 4");
		}
		
	}

}
