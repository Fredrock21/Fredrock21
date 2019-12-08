package V47;

import java.util.Arrays;

public class lexaTilspåmåndag {

	public static void main(String[] args) {
		
		// 100 tal i intervallet [0-9]
		int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};


		// 100 namn
		String[] names = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};
		 
		System.out.println(hurmånga7(numbers));
		
		System.out.println(finstom(names));
		
		System.out.println(mestnummer(numbers));
		
		System.out.println(minstnummer(numbers));
		
		System.out.println(Drusilla(names));
		
		System.out.println(jämnsumma(numbers));
		
		System.out.println(Arrays.toString(antaltal(numbers)));
		
		System.out.println(Lärstarkt(names));
		
		System.out.println(mångafem(names));
		
		System.out.println(unikanamn(names));
		
		System.out.println(felest(names));

	}
	/**
	 * när numbers[i] är likamed 7 ökar sum med 1
	 * @param numbers
	 * retunerar sum.
	 * @return
	 */
	public static int hurmånga7(int[] numbers) {
		
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] == 7)
			
				sum += 1;
		}
		return sum; 
	
	}
	/**
	 * när names[i] är lika med Tom ökar sum med 1.  
	 * @param names
	 * return sum.
	 * @return
	 */
	public static int finstom(String[] names){
		
		int sum = 0;
		for (int i = 0; i < names.length; i++) {
			
			if (names[i].equals("Tom"))
				sum += 1;
		}
		return sum; 
	}
	/**
	 * har två variabler most och max.
	 * kolar egenoem 0-9 med en for loop.
	 * sen med hjälp vaiaben amunt vilket tal som är störst.
	 * när amunt är störe en max endas most till i. 
	 * @param numbers
	 * return moste
	 * @return
	 */
	private static int mestnummer(int[] numbers) {
		
		int most = 0;
		int max = 0; 
		
		for (int i = 0; i < 10; i++) {
			int amunt = 0;
			for (int j = 0; j < numbers.length; j++) {
				if(numbers[j] == i) {
					amunt++;
					
				}
				if (amunt > max) {
					most = i;
					max = amunt;
				}
			}
		}
		return most;
		
	}
	/**
	 * sama som metoden över men tvät om.
	 * @param numbers
	 * @return
	 */
	public static int minstnummer(int[] numbers) {
		
		int most = 0;
		int min = 100;

		for (int i = 0; i < 10; i++) {
			int amount = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) {
					amount++;
				}
			}

			if (amount < min) {
				most = i;
				min = amount;
			}
		}
		return most;
		
	}
	/**
	 * när metoden hitar drusilla ger den variaben Plats positonen med hjälp av en
	 * for loop
	 * @param names
	 * return sum.
	 * @return
	 */
	public static int Drusilla(String[] names) {
		
		int plats = 0;
		
		for (int i = 0; i < names.length; i++) {
			
			if (names[i].contains("Drusilla")) {
				plats = i;
				
			}
			
		}
		return plats;	
	}
	/**
	 * gör en for loop som går igenom alla tal.
	 * alla jämna tal är 0 av modelus 2.
	 * sen tar jag och läger alla som blir 0 på modelus2 i int "sum"
	 * @param numbers
	 * return sum
	 * @return
	 */
	public static int jämnsumma(int[] numbers) {
		
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i]%2 == 0) {
				sum += numbers[i];
			}
			
		}
		return sum;
	}
	/**
	 * ger alla stal melan 0-9 en egen variabel.
	 * räkanar ut hur många de fins av varge med en for loop.
	 * läger dom i en arry och döper den arryen till "tal"
	 * retunerar tal arrye.
	 */
	public static int[] antaltal(int[] numbers) {
		
		int nol = 0;
		int ett = 0;
		int två = 0;
		int tre = 0;
		int fyr = 0;
		int fem = 0;
		int sex = 0;
		int tju = 0;
		int åta = 0;
		int nio = 0;
		int[] tal = new int[10];
		
			for (int j = 0; j < numbers.length; j++) {
				
				if (numbers[j] == 0) {
					nol++;
				}
				if (numbers[j] == 1) {
					ett++;
				}
				if (numbers[j] == 2) {
					två++;
				}
				if (numbers[j] == 3) {
					tre++;
				}
				if (numbers[j] == 4) {
					fyr++;
				}
				if (numbers[j] == 5) {
					fem++;
				}
				if (numbers[j] == 6) {
					sex++;
				}
				if (numbers[j] == 7) {
					tju++;
				}
				if (numbers[j] == 8) {
					åta++;
				}
				if (numbers[j] == 9) {
					nio++;
				}
				tal[0]= nol;
				tal[1]= ett;
				tal[2]= två;
				tal[3]= tre;
				tal[4]= fyr;
				tal[5]= fem;
				tal[6]= sex;
				tal[7]= tju;
				tal[8]= åta;
				tal[9]= nio;
			}
		
		
		return tal;
		
	}
	/**
	 * bara tall som börjar med L har stora L i sig därför. 
	 * plusar jag på variaben "sumL" varge gong jag hiter ettar ett stort
	 * @param names
	 * retunerar sumL
	 * @return
	 */
	
	public static int Lärstarkt(String[] names){
		
		int sumL = 0;
		
		for (int i = 0; i < names.length; i++) {
			
			for (int j = 0; j < names[i].length(); j++) {
				
				if(names[i].charAt(j) == 'L') {
					sumL++;
				}
				
			}
			
		}
		return sumL;
		
}
	/**
	 * glr en metod som läser av hur många bokstärver de fins i varje ord. 
	 * om den är lika med 5 plusar jag på en variabel som heter "antal5":
	 * @param names
	 * retunerar antal5
	 * @return
	 */
	public static int mångafem(String[] names) {
		 
		int antal5 = 0;
		
		for (int i = 0; i < names.length; i++) {
			
			int bokstäver = 0;
			
			for (int j = 0; j < names[i].length(); j++) {
				
				bokstäver++;
				
			}
			if (bokstäver == 5) {
				antal5++; 
			}
		}
		
		return antal5;
	}
	/**
	 * kolar viket namn som bara sägs en gong. 
	 * plusar på "sum" varge gong ett namn uprepas en gong. 
	 * @param names
	 * Retunerar sum.
	 * @return
	 */
	public static int unikanamn(String[] names) {
		
		int sum = 0;
		int unika = 0;
		
		for (int i = 0; i < names.length; i++) {
			
			unika = 0;
			
			for (int j = 0; j < names.length; j++) {
				
				if(names[i] == names[j]) {
					unika++;
				}
			} 
			if(unika == 1) {
				sum++;
			}
			
		}
		return sum;
	}
	/**
	 * skapar en String som heter svar ger den ett värde.
	 * kolar viket namn som komer mest.
	 * byter svar till de namn som uprepas mest.
	 * @param names
	 * sikar tilbaka svar.
	 * @return
	 */
	public static String felest(String[] names) {
		
		String svar = "";
		int max = 0;
		int flest = 0;
		
		for (int i = 0; i < names.length; i++) {
			flest = 0;
			for (int j = 0; j < names.length; j++) {
				
				if(names[i] == names[j]) {
					flest++; 
				}
				
			}
			if(flest > max) {
				svar = names[i];
				max = flest;
				
			}
			
		}
		return svar;
	}
	
}

