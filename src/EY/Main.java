package EY;

import java.util.Scanner;
import java.math.BigInteger;

/**
 * @title
 *
 * @date 11 paź 2020
 *
 * @author Lukasz Janus
 *
 */
class Main {

	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		App app = new App();

		// String check = sc.next();

		assertEquals(true, app.isEgoistic("25"));

	}

	/**
	 * @param b
	 * @param egoistic
	 */
	private static void assertEquals(boolean b, boolean egoistic) {

		System.out.println(egoistic);

	}
}

class App {
	public boolean isEgoistic(String N) {

		//BigInteger v = ;
		
		
		return true;
	}
}