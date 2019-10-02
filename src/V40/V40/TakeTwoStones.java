package V40;

public class TakeTwoStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 0;
		
		for (int i = 0; i < 101; i++) {
			
			N += i;
			
			if (N % 2 == 0) {
				System.out.println("Bob");
			}
			else {
				System.out.println("Alice");
			}	
		
	}
	}
}
