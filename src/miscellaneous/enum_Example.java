/**
 * @title 
 *
 * @date 9 paź 2020
 *
 * @author Lukasz Janus
 *
 */
package miscellaneous;

/**
 * @title Enum Type
 *
 * @date 9 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class enum_Example {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car bmw = new Car("BMW",Colors.BIALY);
		//czyli odwolujemy sie do tej klasy i wybieramy tylko to, co tam jest dostepne
		System.out.println(bmw.color);
		
		switch(bmw.color) {
		case NIEBIESKI:{
			//jakis kod
			break;
		}
		case CZARNY:{
			//jakis kod
			break;
		}
		case BIALY:{ 
		//case BIALYY:{ // <- nie wystepuje w Enum - blad komplilacji
			//jakis kod
			break;
		}
		}

	}

}

/**
 * 
 * @title przykladowa klasa do zastosowania Enum 
 *
 * @date 9 paź 2020
 *
 * @author Lukasz Janus
 *
 */
class Car{
	String model;
	//String Colors; // <- tutaj moge zastosowac moj typ danych
	Colors color;
	
	Car(String marka, Colors color){
		this.model = marka;
		this.color=color;
	}
	
}