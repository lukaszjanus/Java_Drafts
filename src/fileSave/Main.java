package fileSave;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

/**
 * @title Java Review - export data to file  
 *
 * @date 29 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class Main {


	public static void main(String[] args) {
		
		//standard class for file
		File f = new File("plik.txt");
		
		/*
		 * ściezka relatywna:
		 * plik.txt (w folderze projektu)
		 * 
		 * wskazanie na sztywno:
		 * C:\\folder\\folder 
		 * 
		 * File próbuje otworzyć plik, jeśli taki istnieje (zwroci wskaznik)
		 * lub zwróci null, jeśli go nie ma
		 */
		if(!f.exists()) {
			try {
				f.createNewFile();
				System.out.println("Utworzono plik.");
			} catch (IOException e) {
				System.out.println(e+" problem z utworzeniem pliku");
				e.printStackTrace();
			}
		}
		
		//teraz sprawdzamy, czy plik potrafi robić na nim zapis
		//(bo np. nie mamy uprawnień nadanych przez administratora
		if(f.canWrite()) {
			try {
				FileWriter fw = new FileWriter(f,true);
				//konstruktor:
				//f - wskaznik na otwarty plik
				//true - czy dodawac dane do pliku, czy nadpisywac (false)
				System.out.println("uprawnienia pliu zmienione na dopisywanie");
				
				Formatter fm = new Formatter(fw); //fw uzyskuje dostep do pliku, fm sformatuje go
				
				Scanner sf = new Scanner(f); //czytanie z pliku
				
				//i teraz jakies dodawanie
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Podaj tekst do pliku: ");
				String tekst = sc.nextLine(); //next wczyta tylko ciąg do pierwszej spacji
			
				fm.format("%s \r\n", tekst); //czyli formatujemy: wczytujemy string i dla windows znaki końca lini: \r\n

				//dodanie ze zmiennej StringBuilder
				StringBuilder sb = new StringBuilder();
				System.out.println("Podaj tekst SB: ");
				sb.append(sc.nextLine());
				
				fm.format("%s \r\n", sb);
				
				//i na koniec zamykamy plik
				fm.close(); //zamykamy formatera
				fw.close(); //zamykamy fileWritera
				
				//wczytanie pliku - tak dla sprawdzenia, co w nim jest
				//sprawdzamy, czy jest jakakolwiek linia w pliku, czyli odczytujemy po linii
				System.out.println("\n------------zawartosc pliku---------\n");
				while(sf.hasNextLine()) {
					System.out.println(sf.nextLine());
				}
				
				//i zamykamy na koniec scanner
				sc.close();
				sf.close();
				
			} catch (IOException e) {
				System.out.println("nie można zmienić uprawnien pliku "+e);
				e.printStackTrace();
			}
			
		}

	}

}
