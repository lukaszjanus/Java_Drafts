/**
 * @title 
 *
 * @date 24 paź 2020
 *
 * @author Lukasz Janus
 *
 */
package threads;

/**
 * @title Simple Review of Threads:
 * - extends Thread
 * - implements Runnable
 *
 * @date 24 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// extends Thread 
		Obliczenia ob1 = new Obliczenia();
		Obliczenia ob2 = new Obliczenia();

		// ob1.run(); //jeden wątek
		//ob1.start(); //uruchomienie jako wielowątkowy
		//ob2.start();
		
		//implements Runnable
		
		Thread r1 = new Thread(new Obliczenia2());
		Thread r2 = new Thread(new Obliczenia2());
		
		r1.start();
		r2.start();
		
	}

}
