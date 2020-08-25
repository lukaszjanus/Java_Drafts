package drafts;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 
 * @title brudnopis - różne ćwiczenia 
 *
 * @date 25 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class brudnopis {

	static public String test(int a, int b) {

		return a > b ? "a>b" : "b<a";
	}

	public static void main(String[] args) {

		int[] alice = { 5, 25, 50, 120 };
		// int[] alice = {120};
		int[] scores = { 100, 100, 50, 40, 40, 20, 10 };
		int[] result = climbingLeaderboard(scores, alice);
		System.out.println(" wynik: ");
		for (int i : result) {
			System.out.println(i);
		}

	}

	public static String findDay(int month, int day, int year) {

		LocalDate dt = LocalDate.of(year, month, day);

		DayOfWeek dayName = dt.getDayOfWeek();
		return dayName.toString();
	}

	static int[] climbingLeaderboard(int[] scores, int[] alice) {

		// System.out.print(scores);

		/*
		 * 
		 * int al = alice.length; int[] result = new int[al];
		 * 
		 * int[] set = java.util.stream.IntStream.of(scores).distinct().toArray(); int l
		 * =set.length-1;
		 * 
		 * 
		 * for (int j = 0; j < al; j++) { int count = set.length + 1;
		 * 
		 * for (int i=l;i>=0; i--) { System.out.println(set[i] +" "+ alice[j]); if
		 * (set[i] > alice[j]) { System.out.println(count); result[j] = count; break; }
		 * count--; result[j] = count; } }
		 * 
		 */

		int[] result = new int[alice.length];

		int[] array = java.util.stream.IntStream.of(scores).distinct().toArray();
		int i = array.length - 1;

		int j = 0;

		for (int score : alice) {
			while (i >= 0) {
				if (score >= array[i])
					i--;
				else {
					result[j] = i + 2;
					break;
				}
			}
			if (i < 0) {
				result[j] = 1;
			}
			j++;
		}

		return result;
	}

	static int equalStacks(int[] h1, int[] h2, int[] h3) {
		int temp = 0;

		int hh1 = h1.length;
		int hh2 = h2.length;
		int hh3 = h3.length;

		if (hh1 > hh2) {
			if (hh1 > hh3) {
				return hh1;
			}
			if (hh1 < hh3) {
				return hh3;
			}
		}
		if (hh2 > hh1) {
			if (hh2 > hh3) {
				return hh2;
			}
			if (hh2 < hh3) {
				return hh3;
			}
		}
		return 0;
	}
}
