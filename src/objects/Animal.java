package objects;

/**
 * @title Do powtórki Javy: Metody + Abstract
 *
 * @date 5 paź 2020
 *
 * @author Lukasz Janus
 *
 * Abstract - jesli jedna metoda jest abstrakcyjna, to cala klasa musi byc abstrakcyjna.
 * Przy okazji kompilator przypomni o brakujacych metodach, ktore nalezy zaimplementowac.
 * Interfejsów dziedziczymy wiele, dziedziczymy tylko z jednej klasy
 */
abstract public class Animal {

	//final public int n=2;
	//final public void dajGlos() //final - metoda finalna, nie mozna nadpisywac, analogicznie przy klasach, zmiennych
	/*public void dajGlos() {
		System.out.println("grr");
	}*/
	
	abstract public void dajGlos(); //wersja abstract - definicja sygnatury metody
}
