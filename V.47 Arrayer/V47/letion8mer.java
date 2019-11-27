package V47;

public class letion8mer {

	public static void main(String[] args) {
		
		String[] namn = {"Malte","Emil", "Petter", "linus"};
		
		for (int i = 0; i < 40 ; i++) {
			
			for (int j = 0; j < namn.length; j++) {
				i ++;
				System.out.println( i + ". "+ namn[j]);
			}
			i--;
		}

	}

}
