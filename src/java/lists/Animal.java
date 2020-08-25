package java.lists;

/**
 * @title klasa do cwiczen z listami
 *
 *	interfejs Comparable dodany tylko w celu umozliwienia porownania
 * 	obiektów za pomocą Collections
 *
 * @date 24 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class Animal implements Comparable<Animal>{

	String imie;
	int wiek=5;
	/**
	 * @param string
	 */
	public Animal(String imie) {
		this.imie=imie;
		
	}
	
	
	
	//implements comparable - metoda do porównywania obiektów
	@Override
	public int compareTo(Animal arg0) {
		
		//return 0;  //metoda domyslnie zwraca '0' jesli elementy sa sobie rowne
		System.out.println(this.imie.compareTo(arg0.imie));
		if(this.imie.compareTo(arg0.imie) != 0)//czyli jesli obiekty nie sa rowne
		{
			//czyli jeśli są !=0 (nie są identyczne), to mają być posortowane alfabetycznie:
			
			return this.imie.compareTo(arg0.imie); //metoda wbudowania do porównywania, zawiera metodę do porównywania - compareTo,
			//ale inne niż z Comparable, dot. String
		}
		
		//ew. jak są takie same, to sortowanie po wieku:
		
		return this.wiek - arg0.wiek; //czyli jak odejmiemy wiek, to będziemy widzieć, czy jest <>0  
		
		  
		
	}

}
