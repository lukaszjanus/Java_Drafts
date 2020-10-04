package miscellaneous;

/**
 * @title modyfikowanie w metodzie tablicy jako referencji
 *
 * @date 13 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class Klasa_referencja {

	
	public static void main(String[] args) {
		int[] tab = { 2, 4 };
		System.out.println("Main: " + tab[0]);

		// przekazuje typ zlozony - czyli przekazuje do metody nie tablice, a wartosc jej referencji
		zmien(tab);

		// zmiana wprowadzona w metodzie jest widoczna bez potrzeby zwracania tablicy
		System.out.println("Za main: " + tab[0]);

		/////////// wersja klasyczna - przekazanie i zwrocenie tablicy
		int[] tab2 = { 2, 4 };

		tab2 = zmien2(tab2); //działa jak nadpisanie tablicy (return new int[]), efekt ten
		System.out.println(tab2[0]);
		
		
		// tutaj też jest referencja
		int[] tab3= {4};
		int[] tab4=tab3; //typ zlozony - kopiuje referencje
		tab4[0]=5; // zmieniam wartosc tab 4, która przechowuje referencje tab3 
		System.out.println(tab3[0]); //w efekcie tab3[0] jest '5'
	}

	// przesłanie referencji - bez żadnego 'return tab'
	public static void zmien(int[] t) {
		t[0] += 5;
		System.out.println("Metoda: " + t[0]);
	}

	// nadpisanie referencji tablicy
	private static int[] zmien2(int[] tab2) {
		tab2 = new int[2];
		tab2[0] += 20;

		return tab2;
	}
}
