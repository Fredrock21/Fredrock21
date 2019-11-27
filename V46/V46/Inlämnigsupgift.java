package V46;

import java.util.Scanner;

public class Inl�mnigsupgift {

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
		
		System.out.println("dn kenitiska energin �r");
		
		System.out.println(kineticEnergy (mass, velocity));
		
		double mass2;
		System.out.println("masan");
		mass2 = input.nextInt();
		
		double height;
		System.out.println("h�jden");
		height = input.nextInt();
		
		System.out.println(" den potentiell energi �r");
		
		System.out.println(potentialEnergy (mass2, height));
		
		System.out.println("skriv tre tall f� tilbaka deras medelv�rde");
		
		double first;
		double second;
		double last;
		first = input.nextInt();
		second = input.nextInt();
		last = input.nextInt();
		
		System.out.println("medelv�rdet �r");
		
		System.out.println(delta(first, second, last));
		
		String word = "PaParaZZi";
		
		System.out.println(smallLetters(word));
		
		String menig ="Jag vill bli godk�nd i programmering! <3";
		
		System.out.println(pr0grammering(menig));
		
		System.out.println("skriv in streka och velosetet och f� tilbaka tiden");
		
		double distance;
		distance = input.nextInt();
		
		double velocity2;
		velocity2 = input.nextInt();
		
		System.out.println(svtTime(distance,velocity2));
		
		System.out.println("skriv in krafter och l�ngden och f� tillbaka arbetet");
		double force;
		force = input.nextInt();
		
		double distance2;
		distance2 = input.nextInt();
		
		System.out.println("arbetet �r");
		
		System.out.println(work(force,distance));
		
		System.out.println();
		
		System.out.println("skriv in velositeten och f� tilbaka h�jden");
		
		double velocity3;
		velocity3 = input.nextInt();
		
		System.out.println(velocityToHeight(velocity3));
		
		System.out.println("skriv in volymen p� ett klott och sen f� tilbaka radien");
		
		double Volume;
		Volume = input.nextInt();
		
		System.out.println(sphereVolumeToRadius(Volume));
		 
		System.out.println("skriv in massa och h�jd och tid och h�jden och f� tilbaka efekten av ett falade f�rem�l");
		
		double massa = input.nextInt();
		
		double hagt = input.nextInt();
		
		double tid = input.nextInt();
		
		System.out.println("Effekten �r ");
		
		System.out.println(effektavdenpotensielaenergin(massa,hagt,tid));
		
		String klar = "Entligen f�rdig med Programerinsgs l�xa";
		
		System.out.println("menigen \"Entligen f�rdig med Programerinsgs l�xa\" har en l�ng av ");
			
		System.out.println(Sista(klar));
	}
	/**
	 * tar emot F som �r fahermheit 
	 * @param F
	 * endrar fahrenheit till Kelvin "K"
	 * @return K
	 */
	public static double fahrenheitToKelvin (double F){
		
		double K = (F + 459.15)*5/9;
		return K;		
	}
	/**
	 * tar emot kelvin som �r "k"
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
	 * endrar den till (M/s) d�per det till "ms"
	 * @return ms 
	 */
	public static double velocityConversion (double kmh ) {
		
		double ms = (kmh/3.6);
		return ms;	
	}
	/**
	 * metoden r�kan utt Kinetisk energi med hj�lp av Massa och veilosetiet.
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
	 * deelar dom p� re och f�r fram medelv�rdet.
	 * D�per den till "medel".
	 * @return medel
	 */
	public static double delta(double first, double second, double last) {
		
		double medel = (first+second+last)/3;
		
		return medel;
		
	}
	/**
	 * tar emot str�ngen word 
	 * @param word
	 * endrar word till sm� mogst�ver 
	 * @return word
	 */
	public static String smallLetters(String word) {
		
		return word.toLowerCase();
		
	}
	/**
	 * tar emot str�ngen menig.
	 * @param menig
	 * omvandlar f�rst alla till stora bost�ver och sen alla stora o till 0.
	 * d�per om strengen till "M"
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
	 * r�knar utt tiden med formen (s/V) och d�per den till "Tid"
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
	 * sen r�kanas arbetet ut med formen (W = F*s)
	 * @return Arbete
	 */
	public static double work(double force, double distance) {
		
		double Arbete = force*distance;
		
		return Arbete;
		
	}
	/**
	 * tar emot double velocity3  
	 * @param velocity
	 * r�knar ut h�jden och ger den namnet "P"
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
	 * sen r�knar jag ut radien och ger den namnet "W"
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
	 * och r�kanr ut den effekt merd ekvatonen (P = m*g*h/tid).
	 * @return P
	 */
	public static double effektavdenpotensielaenergin(double massa,double hagt,double tid) {
		double g = 9.82;
		
		double P = (massa*hagt*g)/tid;
		
		return P;
	}
	/**
	 * tar in strengen "klar".
	 * komadet .length() r�knar ut hur l�ng raden�r.
	 * skickar tilbaka metoden.
	 * 
	 * @param klar
	 * @return
	 */
	public static int Sista(String klar) {
		
		return klar.length();
		
	}
	
	
	
	

}
