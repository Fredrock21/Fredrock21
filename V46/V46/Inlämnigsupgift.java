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
		
		double kms ;
		kms = input.nextInt();
		
		System.out.println(velocityConversion(kms));
		
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
	
	public static double fahrenheitToKelvin (double F){
		
		double K = (F + 459.15)*5/9;
		return K;		
	}
	
	public static double kelvinToCelsius (double k) {
		
		
		double C = (k - 273.15);
		return C;
		
	
	}
	public static double velocityConversion (double kms ) {
		
		double ms = (kms/3.6);
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
	
	
	public static double potentialEnergy(double mass, double height) {
			
		double g = 9.82;
		
		double potentiellenergi = (mass*g*height);
		
		return  potentiellenergi;
	}
	public static double delta(double first, double second, double last) {
		
		double medel = (first+second+last)/3;
		
		return medel;
		
	}
	public static String smallLetters(String word) {
		
		return word.toLowerCase();
		
	}
	public static String pr0grammering(String menig) {
	
		String M = menig.replace('O', '0').toUpperCase();
		
		return M;
		
	}
	public static double svtTime(double distance, double velocity) {
		
		double Tid = (distance)/velocity;
		
		return Tid;
		
	}
	public static double work(double force, double distance) {
		
		double Arbete = force*distance;
		
		return Arbete;
		
	}
	public static double velocityToHeight(double velocity) {
		
		double g = 9.82;
		
		double P = (velocity*velocity)/(g*2);
		
		return P;
		
	}
	public static double sphereVolumeToRadius(double Volume) {
		
		double W = ((((Volume)*3)/4)/Math.PI);
		
		return Math.pow(W, (1/3));
				
	
		
	}
	public static double effektavdenpotensielaenergin(double massa,double hagt,double tid) {
		double g = 9.82;
		
		double Ep = (massa*hagt*g)/tid;
		
		return Ep;
	}
	/**
	 * tar in strengen "klar".
	 * komadet .length() r�knar ut hur l�ng raden�r.
	 * skickar tilbaka 
	 * 
	 * @param klar
	 * @return
	 */
	public static int Sista(String klar) {
		
		return klar.length();
		
	}
	
	
	
	

}
