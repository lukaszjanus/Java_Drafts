package miscellaneous;

/**
 * @title Rekurencja - prosta sciaga 
 *
 * @date 29 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class Rekurencja {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final long L = 100;
		
		long start = System.nanoTime();

		System.out.println(silnia(L));
		
		long stop = start - System.nanoTime();
		System.out.println("Czas: "+stop);
		
		System.out.println("==============");
		start = System.nanoTime();

		System.out.println(rekurencja(L));
		
		stop = start - System.nanoTime();
		System.out.println("Czas: "+stop);
	}

	/**
	 * silnia rekurencyjna
	 * 
	 * @param l
	 * @return
	 */
	private static long rekurencja(long l) {

		//warunek domyślny, dla ktorego rekurencja ma warunek przerywajacy rekurencje
		if(l<=1) return 1;
		
		else return l*rekurencja(l-1);
	}

	/**
	 * klasyczna silnia
	 * 
	 * @param l
	 * @return
	 */
	private static Long silnia(long l) {

		long wynik = 1;
		
		for(int i=2;i<=l;i++) {
			wynik*=i;
		}
		
		return wynik;
	}

}
