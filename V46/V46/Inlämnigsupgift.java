package V46;

import java.util.Scanner;

public class Inlämnigsupgift {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double F ;
		F = input.nextInt();
		
		System.out.printf("%.2f",fahrenheitToKelvin(F));
		
		double k;
		k = input.nextInt();
		
		System.out.println(kelvinToCelsius(k));
		
		double kmh ;
		kmh = input.nextInt();
		
		System.out.println(velocityConversion(kmh));
		
		System.out.println("masan");
		double mass;
		mass = input.nextInt();
		
		System.out.println("veloseteten");
		double velocity;
		velocity = input.nextInt();
		
		System.out.println("dn kenitiska energin är");
		
		System.out.println(kineticEnergy (mass, velocity));
		
		double mass2;
		System.out.println("masan");
		mass2 = input.nextInt();
		
		double height;
		System.out.println("höjden");
		height = input.nextInt();
		
		System.out.println(" den potentiell energi är");
		
		System.out.println(potentialEnergy (mass2, height));
		
		System.out.println("skriv tre tall få tilbaka deras medelvärde");
		
		double first;
		double second;
		double last;
		first = input.nextInt();
		second = input.nextInt();
		last = input.nextInt();
		
		System.out.println("medelvärdet är");
		
		System.out.println(delta(first, second, last));
		
		String word = "PaParaZZi";
		
		System.out.println(smallLetters(word));
		
		String menig ="Jag vill bli godkänd i programmering! <3";
		
		System.out.println(pr0grammering(menig));
		
		System.out.println("skriv in streka och velosetet och få tilbaka tiden");
		
		double distance;
		distance = input.nextInt();
		
		double velocity2;
		velocity2 = input.nextInt();
		
		System.out.println(svtTime(distance,velocity2));
		
		System.out.println("skriv in krafter och längden och få tillbaka arbetet");
		double force;
		force = input.nextInt();
		
		double distance2;
		distance2 = input.nextInt();
		
		System.out.println("arbetet är");
		
		System.out.println(work(force,distance));
		
		System.out.println();
		
		System.out.println("skriv in velositeten och få tilbaka höjden");
		
		double velocity3;
		velocity3 = input.nextInt();
		
		System.out.println(velocityToHeight(velocity3));
		
		System.out.println("skriv in volymen på ett klott och sen få tilbaka radien");
		
		double Volume;
		Volume = input.nextInt();
		
		System.out.println(sphereVolumeToRadius(Volume));
		 
		System.out.println("skriv in massa och höjd och tid och höjden och få tilbaka efekten av ett falade föremål");
		
		double massa = input.nextInt();
		
		double hagt = input.nextInt();
		
		double tid = input.nextInt();
		
		System.out.println("Effekten är ");
		
		System.out.println(effektavdenpotensielaenergin(massa,hagt,tid));
		
		String klar = "Entligen färdig med Programerinsgs läxa";
		
		System.out.println("menigen \"Entligen färdig med Programerinsgs läxa\" har en läng av ");
			
		System.out.println(Sista(klar));
	}
	/**
	 * tar emot F som är fahermheit 
	 * @param F
	 * endrar fahrenheit till Kelvin "K"
	 * @return K
	 */
	public static double fahrenheitToKelvin (double F){
		
		double K = (F + 459.15)*5/9;
		return K;		
	}
	/**
	 * tar emot kelvin som är "k"
	 * @param k
	 * ovandlar till Celsius "C"
	 * @return C
	 */
	public static double kelvinToCelsius (double k) {
		
		
		double C = (k - 273.15);
		return C;
		
	
	}
	/**
	 * tar in double kmh (Km/h) 
	 * @param kms
	 * endrar den till (M/s) döper det till "ms"
	 * @return ms 
	 */
	public static double velocityConversion (double kmh ) {
		
		double ms = (kmh/3.6);
		return ms;	
	}
	/**
	 * metoden räkan utt Kinetisk energi med hjälp av Massa och veilosetiet.
	 * @param mass
	 * @param velocity
	 * @return kinetiskenergi
	 */
	public static double kineticEnergy(double mass, double velocity) {
		
		double kinetiskenergi = ((mass*velocity*velocity)/2) ;
		
		return  kinetiskenergi;
	}
	/**
	 * 
	 * @param mass
	 * @param height
	 * @return
	 */
	public static double potentialEnergy(double mass, double height) {
			
		double g = 9.82;
		
		double potentiellenergi = (mass*g*height);
		
		return  potentiellenergi;
	}
	/**
	 * tar emot tre Dobels first, second och last.
	 * @param first
	 * @param second
	 * @param last
	 * deelar dom på re och får fram medelvärdet.
	 * Döper den till "medel".
	 * @return medel
	 */
	public static double delta(double first, double second, double last) {
		
		double medel = (first+second+last)/3;
		
		return medel;
		
	}
	/**
	 * tar emot strängen word 
	 * @param word
	 * endrar word till små mogstäver 
	 * @return word
	 */
	public static String smallLetters(String word) {
		
		return word.toLowerCase();
		
	}
	/**
	 * tar emot strängen menig.
	 * @param menig
	 * omvandlar först alla till stora bostäver och sen alla stora o till 0.
	 * döper om strengen till "M"
	 * @return M
	 */
	public static String pr0grammering(String menig) {
	
		String M = menig.replace('O', '0').toUpperCase();
		
		return M;
		
	}
	/**
	 * tar emot doubles distance och velocity2.
	 * @param distance
	 * @param velocity
	 * räknar utt tiden med formen (s/V) och döper den till "Tid"
	 * @return Tid
	 */
	public static double svtTime(double distance, double velocity) {
		
		double Tid = (distance)/velocity;
		
		return Tid;
		
	}
	/**
	 * tar emot doubes force och distance2.
	 * @param force
	 * @param distance
	 * sen räkanas arbetet ut med formen (W = F*s)
	 * @return Arbete
	 */
	public static double work(double force, double distance) {
		
		double Arbete = force*distance;
		
		return Arbete;
		
	}
	/**
	 * tar emot double velocity3  
	 * @param velocity
	 * räknar ut höjden och ger den namnet "P"
	 * @return P
	 */
	public static double velocityToHeight(double velocity) {
		
		double g = 9.82;
		
		double P = (velocity*velocity)/(g*2);
		
		return P;
		
	}
	/**
	 * tar emot doublen Volume  
	 * @param Volume
	 * sen räknar jag ut radien och ger den namnet "W"
	 * @return W
	 */
	public static double sphereVolumeToRadius(double Volume) {
		
		double W = ((((Volume)*3)/4)/Math.PI);
		
		return Math.pow(W, (1/3));
				
	
		
	}
	/**
	 * den ter emot doubles
	 * @param massa
	 * @param hagt
	 * @param tid
	 * och räkanr ut den effekt merd ekvatonen (P = m*g*h/tid).
	 * @return P
	 */
	public static double effektavdenpotensielaenergin(double massa,double hagt,double tid) {
		double g = 9.82;
		
		double P = (massa*hagt*g)/tid;
		
		return P;
	}
	/**
	 * tar in strengen "klar".
	 * komadet .length() räknar ut hur lång radenär.
	 * skickar tilbaka metoden.
	 * 
	 * @param klar
	 * @return
	 */
	public static int Sista(String klar) {
		
		return klar.length();
		
	}
	
	
	
	

}
