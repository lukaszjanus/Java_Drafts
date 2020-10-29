package objects.equals;

/**
 * @title Powtórka Javy:
 * 
 * - porównanie obiektów (equals)
 * - string builder 
 * 
 *
 * @date 29 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class Porownanie_Obiektow {

	
	public static void main(String[] args) {

		Animal a1 = new Animal();
		Animal a2 = new Animal();
		
		a1.name="test";
		a2.name="test";
		//a1==a2 - porównujemy referencje, tu false
		a1=a2;
		//a1==a2 -> tu true, bo referencja wskazuje na ten sam obiekt
		
		//System.out.println(a1.equals(a2)); //domyslna metoda (nieprzeciazna - analogiczie do '=='
		
		/***************************/
		// string builder
		/***************************/
		
		int j=100000;

		String s = "";
		long start = System.currentTimeMillis();
		for(int i=0;i<j;i++) {
			s+="a";
		}
		long stop = System.currentTimeMillis() - start;

		System.out.println(stop);
		
		/***************************/
		
		StringBuilder sb = new StringBuilder();

		start = System.currentTimeMillis();
		for(int i=0;i<j;i++) {
			sb.append("a");
		}
		stop = System.currentTimeMillis() - start;

		System.out.println(stop);
	}

}
