package java.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @title tutorial z kolekcjami:
 * - Array lista (w tym generyczna) 
 * - Linked list
 * - HashMap
 * - HashSet (LinkedHashSet)
 * Klasa Animal - implementacja comparable - sortowanie obiektow
 * 
 * @date 24 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class Kolekcje {
	
	public static void main(String[] arg) {
		
		//arrayLista();
		
		//linkedLista();
		
		//mapaHashMap();

		//lista_HashSet();
		
		//kolekcje_typy_proste();
		
		kolekcje_obiekty();
	}

	
	/**
	 * Kolekcje - sortowanie obiektow
	 */
	private static void kolekcje_obiekty() {
		Animal kot1 = new Animal("Kot 1");
		Animal kot2 = new Animal("Kot 5");
		Animal kot3 = new Animal("Kot 30");
		Animal kot4 = new Animal("Kot 3");
		Animal kot5 = new Animal("Kot 3");
		
		ArrayList<Animal> lista1 = new ArrayList<>();
		
		lista1.add(kot1);
		lista1.add(kot2);
		lista1.add(kot3);
		lista1.add(kot4);
		lista1.add(kot5);
		
		for(Animal kot : lista1) { //tu już mogę korzystać z obiektu Animal
			System.out.println(kot.imie+" lat: "+kot.wiek);
		}
		
		
		Collections.sort(lista1);
		System.out.println("Sortowanie obiektowe: ");
		
		
		for(Animal kot : lista1) { //tu już mogę korzystać z obiektu Animal
			System.out.println(kot.imie+" lat: "+kot.wiek);
		}
	}


	/**
	 * Ćwiczenia - inne przydatne do kolekcji
	 */
	private static void kolekcje_typy_proste() {

		ArrayList<String> lista = new ArrayList<>(); //w drugim <> nie muszę już ponawiać typu danych
		lista.add("element3x");
		lista.add("element1");
		lista.add("element2");
		lista.add("element3");
		
		
		for(String e : lista) {
			System.out.println(e);
		}
		
		Collections.sort(lista);
		System.out.println("Posortowane: ");
		for(String e : lista) {
			System.out.println(e);
		}
		
		System.out.println(" ");
		System.out.println("Minimum: "+Collections.min(lista));
		System.out.println("Max: "+Collections.max(lista));
		
		Collections.reverse(lista);
		System.out.println("Odwrócone: ");
		
		for(String e : lista) {
			System.out.println(e);
		}
		
		Collections.shuffle(lista);
		System.out.println("Kolejność losowa: ");
		for(String e : lista) {
			System.out.println(e);
		}
				
		//sortowanie przez collectionslista.add("element3x");lista.add("element3x");lista.add("element3x");`
		
	}


	//lista unikalna, czyli zbiór, od razu segreguje
	private static void lista_HashSet() {
		
		//aby nie segregowała, to wtedy posługujemy się:
		//LinkedHashSet<String>
		HashSet<String> zbior = new HashSet<>();
		
		
		zbior.add("element2");
		zbior.add("element2");
		zbior.add("element3");
		zbior.add("element1");
		
		for(String e : zbior) {
			System.out.println(e);
		}
		zbior.clear(); //czyszczenie listy
	}

	//mapa klucz/wartosc
	private static void mapaHashMap() {
		HashMap<Integer,String> mapa = new HashMap<>(); //w drugim <> nie muszę już ponawiać typu danych
		mapa.put(1, "Poniedzialek");
		mapa.put(2, "Wtorek"); //<key, value>
		mapa.put(3, "Sroda");
		
		System.out.println(mapa.get(1)); //pobieram po key
		
		//iteracja po mapie:
		
		for(String e: mapa.values()) {
			System.out.println(e);
		}
	}

	//LinkedList - szybsza od arrayList w odczycie
	private static void linkedLista() {
		LinkedList<String> lista = new LinkedList<>(); //w drugim <> nie muszę już ponawiać typu danych
		lista.add("element1");
		lista.add("element2");
		lista.add("element3");
		
		for(String e : lista) {
			System.out.println(e);
		}
		lista.clear(); //czyszczenie listy
	}

	//zwykła array Lista
	private static void arrayLista() {
		Animal kot1 = new Animal("Kot 1");
		Animal kot2 = new Animal("Kot 2");
		Animal kot3 = new Animal("Kot 3");
		
		ArrayList lista1 = new ArrayList();
		
		lista1.add(kot1);
		lista1.add(kot2);
		lista1.add(kot3);
		lista1.add(3); //bez castowania -> da się dodać wszystko, ale potem może być wyjątek i program wysypie sie
		System.out.println(lista1.get(3)); //tu nawet zadziała bez 'cast'
		
		System.out.println(((Animal)lista1.get(0)).imie); //wersja czystej listy - wymaganie rzutowanie
		
		System.out.println(lista1.contains(3)); //czy zawiera index nr 3? false/true :)
		
		for(Object o : lista1) { //object - najniższy poziom, trzeba castować jak poniżej:
			System.out.println(((Animal)o).imie); //tu może się wysypać, jeśli castujemy cyfrę 3
			
		}
		
		ArrayList<Animal> lista2 = new ArrayList<Animal>(); // <obiekt> - inaczej lista generyczna
		
		lista2.add(kot1);
		lista2.add(kot2);
		lista2.add(kot3);
		
		for(Animal o : lista2) { //tu już mogę korzystać z obiektu Animal
			System.out.println(o.imie);
		}
	}

}
