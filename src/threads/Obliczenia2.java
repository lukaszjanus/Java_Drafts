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
 * @title 
 *
 * @date 24 paź 2020
 *
 * @author Lukasz Janus
 *
 */
public class Obliczenia2 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<=100;i++) {
			
			System.out.println(i+". ID:"+Thread.currentThread().getId());
			
		}
	}

}
