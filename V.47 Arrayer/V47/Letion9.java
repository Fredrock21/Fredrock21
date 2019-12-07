package V47;

public class Letion9 {

	public static void main(String[] args) {
		
		

		
		String[] namn = {"Fredrik","Emrik", "Filip", "Jonatan", "Kajsa", "Anton","Ask"};
		
		int antalA = 0;
		for (int i = 0; i < namn.length; i++) {
			
			for (int j = 0; j < namn[i].length(); j++) {
				
				if (namn[i].charAt(j) == 'a') {
					antalA++;
			}
				System.out.println("antal a är" + antalA);
		}
			
	}
}
}
