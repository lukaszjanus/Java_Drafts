package java.queues_stacks;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * @title tutorial:
 * - stos (stack FI-LO)
 * - kolejka (queue - FI-FO)
 *
 * @date 25 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class Kolejka {

	public static void main(String[] args) {
		
		//kolejka();
		
		//stos();
		
	}

	/**
	 * Stos - podstawowa skladnia
	 */
	private static void stos() {
		Stack<String> stos = new Stack<>(); //odwrotnie jak kolejka
		
		stos.push("el1");
		stos.push("el3");
		stos.add("el2");
		stos.add(1, "test");
		stos.add("ostatni");
		
		for(String s : stos) {
			System.out.println(s);
		}
		System.out.println(stos.size());
		
		System.out.println("Podstawowe metody:");
		
		System.out.println("usuwanie: "+stos.pop());
		
		System.out.println("podgladanie nastepnego do obslugi: "+stos.peek());
		for(String s : stos) {
			System.out.println(s);
		}
	}

	/**
	 * Kolejka - podstawowa skladnia
	 */
	private static void kolejka() {
		Queue<String> kolejka = new ArrayDeque<>(); //ArrayDeque dziedziczy z Queue
		
		//dodawanie:
		kolejka.add("el1");
		kolejka.add("el3");
		kolejka.add("el2");
		//inny sposob (add zwroci wyjatek, gdy kolejka jest pelna, offer zwroci w takiej sytuacji null)
		kolejka.offer("el4");
		
		for(String s : kolejka) {
			System.out.println(s);
		}
		System.out.println("Przydatne metody:");
		System.out.println(kolejka.peek()); //sprawdzenie, co jest w kolejce do usuniecia
		
		
		System.out.println(kolejka.size());
		
		//usuwanie z kolejki - usuwany jest "el1" -> zwracany jest wtedy element pierwszy z kolejki
		System.out.println(kolejka.remove());
		//usuwanie - II sposob
		System.out.println(kolejka.poll());
		System.out.println(kolejka.poll());
		System.out.println(kolejka.poll());
		System.out.println(kolejka.poll()); //-> przy pustej kolejce bedzie zwrocony 'null', program nie wysypie sie
		//System.out.println(kolejka.remove()); //-> przy pustej kolejce bedzie wyjatek NoSuchElementException
	}

}
