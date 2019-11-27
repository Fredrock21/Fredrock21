package V47;

public class Letion9 {

	public static void main(String[] args) {
		
		
		double[] numbers =  new double[20];
		double[] numbers2 = {12.2,34,4.5,};
		
		String[] namn = {"Fredrik","Emrik", "Filip", "Jonatan", "Kanjsa", "Anton","Ask"};
		
		for (int i = 0; i < namn.length; i++) {
			int antalA = 0;
			
			for (int j = 0; j < namn[i].length(); j++) {
				
				if (namn[j].contains("a")) {
					
					antalA++;
			}
			
		}
			System.out.println("antal A är" + antalA);
	}
		
}
}
