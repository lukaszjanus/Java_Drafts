package objects;

/**
 * @title Powtórka Javy: Metody + Abstract + instance of
 *
 * @date 5 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class Metody_Abstract {
	public static void main(String[] args) throws ZleImieException {
		Cat kot = new Cat();
		kot.dajGlos();
		System.out.println(kot.toString());
		
		Animal pies = new Dog("Burek"); //obiekt mozemy przechowywac na bazie klasy wstecz
		//co nam to daje? metoda dajGlos() jest wywolywana od razu z Dog;
		pies.dajGlos();
		//pies.idz(); //ale ta metoda nie jest już widoczna, bo nie ma tej metody w klasie bazowej
		((Dog)pies).idz(); //ale działa to w formie rzutowania
		//jak uzuwac? Wedle potrzeb, najlepiej uzywac tej samej klasy, ale czasami trzeba ograniczyc ilosc metod
		//ww ogarnia abstract
		
		//ew aby uniknac rzutowania, mozna sprawdzic klase, czy jest to 'instance of':
		
		if(pies instanceof Dog ) {
			System.out.println("Warunek: ");
			System.out.println(pies instanceof Cat);
			System.out.println(pies instanceof Animal);
			System.out.println(pies instanceof Dog);
		}
		//a jeszcze ladniej - try-catch
		try {
			((Cat)pies).dajGlos();
		}catch(ClassCastException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		finally { //czyli taki default ma sie wykonac:
			System.out.println("np wylaczamy dostep do bazy -> i tak sie wykona");
		}
	}
}
