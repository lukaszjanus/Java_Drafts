package objects;

/**
 * @title Do powtórki Javy: Metody + Abstract 
 *
 * @date 5 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class Dog extends Animal{

	String imie;
	
	Dog(String imie) throws ZleImieException{
		if(imie.length()==0) {
			throw new ZleImieException();
		}
	}
	
	
	@Override
	public void dajGlos() {
		System.out.println("hau");
	}
	
	
	public void idz() {
		System.out.println("ide");
	}
}
