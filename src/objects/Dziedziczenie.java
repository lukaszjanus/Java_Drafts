package objects;

/**
 * @title Powtorka, sciaga na wszelki wypadek.
 *
 * @date 4 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class Dziedziczenie {

	public static void main(String[] args) {

		Samochod audi = new Samochod();

		audi.marka = "test";
		
		SamochodSportowy subaru = new SamochodSportowy("ford",4,2);
	}


}

/**
 * @title przykladowa klasa bazowa
 */
class Pojazd {

	int iloscKol;
	String marka;

	//////////////////////
	Pojazd() {
		System.out.println("Konstruktor klasy - Pojazd bezparametrowy");
	}

	Pojazd(String marka, int iloscKol) {
		this.marka = marka;
		this.iloscKol = iloscKol;
		System.out.println("Konstruktor klasy - Pojazd parametrowy");
	}

	protected void odpal() {
		System.out.println("Odpalil!");
	}
}


/* przykladowe klasy dziedziczace */
class Samochod extends Pojazd {

	
	boolean otwarty = false;
	int iloscDrzwi;
	
	//konstruktory
	
	Samochod() {
		super(); //odwolanie do konstruktora domyslnego powyzej
		// this.marka=super.marka; //odwolanie do zmiennej
		System.out.println("Konstruktor klasy - Samochod bez-parametrowy");
	}

	Samochod(String marka, int iloscKol, int iloscDrzwi) {
		super(marka, iloscKol);
		this.iloscDrzwi = iloscDrzwi;
		System.out.println("Konstruktor klasy - Samochod parametrowy");
	}


	void zamknijOtworz() {
		otwarty = !otwarty;
		if (otwarty) {
			System.out.println("Otwarto");
		} else {
			System.out.println("Zamknieto");
		}

	}

}

class SamochodSportowy extends Samochod {

	SamochodSportowy(){
		super();
		System.out.println("Konstruktor klasy - Samochod Sportowy bezparametrowy");
	}
	
	SamochodSportowy(String marka, int iloscKol, int iloscDrzwi) {
		super(marka, iloscKol, iloscDrzwi); //odwolanie do konstruktora parametrowego

		System.out.println("Konstruktor klasy - Samochod Sportowy parametrowy");
	}
}