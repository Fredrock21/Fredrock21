import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class arrylistintro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Fredrik");// index 0
		nameList.add("Tomas");// index 1
		nameList.add(1, "Edvin"); // index 1 Tommas hamnar på plats 2
		
		for (int i = 0; i < nameList.size(); i++) {
		System.out.println(nameList.get(i));
		}
		System.out.println();
		nameList.remove(2);
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
			}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
	for (int i = 0; i < 100; i++) {
		int temp = (int)(Math.random()*1000);
		numbers.add(temp);
	}
	Collections.sort(numbers);
	
	for (int i = 0; i < 100; i++) {
		System.out.println(numbers.get(i));
	}
	
	System.out.println(numbers);
	
		
	}

}
