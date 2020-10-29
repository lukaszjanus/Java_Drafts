package objects;

/**
 * @title Do powtórki Javy: Metody + Abstract 
 *
 * @date 5 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class Cat extends Animal {

	@Override //zwykle przeciazanie metody ktora juz gdzies jest
	public void dajGlos() {
		System.out.println("miau");
		//super.dajGlos(); //a tu wywoluje ponownie metode z klasy bazowej
		//oczywiscie nie zadziala, gdy rodzic jest abstrakcyjny
	}

	@Override
	public String toString() {
		return "Cat [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}	
}
