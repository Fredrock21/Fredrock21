import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.Name;

public class �vningAttayintro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		ArrayList<String> nameList = new ArrayList<String>();
		String[] namn = {"Billskog Gabriel" , "Bratland Petter" , 
				"Dahlqvist Ida" , "Erlandsson Malte" , "Favoryt Kalle" , 
				"Gustafsson Emil" , "Hasic Edvin" , "Helenius Anton" , 
				"Jensl�v Max" , "Jonsson Svante" , "Kamo Vivian" , 
				"Khanzade Vakil Kandi Pedram" , "Leisten David" , 
				"Lindqvist Lucas" , "Lindstr�m Linus" , 
				"Markstr�m Stenhammar Zachris" , "Nelin Jacob" , 
				"Niklasson Theodor" , "Nilsson Fredrik" , "Norberg Max" , 
				"Ohlsson Andreas" , "Parsa Filip" , "Richardsson Filippa" , 
				"Roman David" , "Romland Linus" , "Sandstr�m Ludvig" , 
				"Simonsen Johan" , "Simonsen Markus" , "Tammpere Patrik" , 
				"Thil�n Philip" , "Utbult David" , "Vins Andreas"};
		
		for (int i = 0; i < namn.length; i++) {
			
			nameList.add(namn[i]);
		}
		
		System.out.println(nameList);
		nameList.add(10, namn[5]);
		nameList.add(5, namn[10]);
		
		nameList.remove(6);
		nameList.remove(11);
		
		
		System.out.println(nameList);
		
		nameList.add(0, "Lavno Ling Emrik ");
		
		System.out.println(nameList);
		
		for (int i = 0; i < namn.length; i++) {
			
			if (namn[i].charAt(0) == 'L') {
				nameList.remove(namn[i]);
			}
			
		}
		System.out.println(nameList);
		
		nameList.remove("Nilsson Fredrik");
		
		nameList.add(0, "Nilsson Fredrik");
		
		System.out.println(nameList);
		
		
		
		// L�gg in f�ljande namn i arrayListen "namn"
		// ["Billskog Gabriel" , "Bratland Petter" , "Dahlqvist Ida" , "Erlandsson Malte" , "Favoryt Kalle" , "Gustafsson Emil" , "Hasic Edvin" , "Helenius Anton" , "Jensl�v Max" , "Jonsson Svante" , "Kamo Vivian" , "Khanzade Vakil Kandi Pedram" , "Leisten David" , "Lindqvist Lucas" , "Lindstr�m Linus" , "Markstr�m Stenhammar Zachris" , "Nelin Jacob" , "Niklasson Theodor" , "Nilsson Fredrik" , "Norberg Max" , "Ohlsson Andreas" , "Parsa Filip" , "Richardsson Filippa" , "Roman David" , "Romland Linus" , "Sandstr�m Ludvig" , "Simonsen Johan" , "Simonsen Markus" , "Tammpere Patrik" , "Thil�n Philip" , "Utbult David" , "Vins Andreas"]
		
		// Byt plats p� 5:e och 10:e namnet och skriv ut listan
		
		// L�gg in en dublett av valfritt namn fr�n listan p� f�rsta platsen och skriv ut listan
		
		// Ta bort alla namn som b�rjar p� bokstaven L och skriv ut listan

		// Flytta ditt namn till f�rsta platsen och skriv ut listan
		
		// Sortera namnlistan omv�nd fr�n � till A
		
	}

		

}


