package drafts;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 * 
 * @title Brudnopis - różne ćwiczenia
 *
 * @date 25 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class Solution {

	private static void result(int n) {

		for (int i = 1; i <= n; i++) {
			//System.out.println(i + ":");
			check(i);

		}

	}

	private static void check(int n) {

		//System.out.print(" i w petli: ");
		boolean flag = false;
		for (int i = 2; i < n; i++) {
			//System.out.print(" "+i + " ");
			if(isPrime(i)) {
			//	System.out.println("pierwsza");
			System.out.print(i + " ");
			flag = true;
			}
		}
		if(flag && isPrime(n)) {
			System.out.println(n);
		}else {
			System.out.println();
		}
	}

	
	private static boolean isPrime(int n) {
		
		if(n==0 || n==1) {
			return false;
		}
		
		boolean flag = true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				//System.out.println(i+" % "+n+"="+(i%n));
				flag=false;
			}
		}
		return flag;
	}

	
	public static void main(String[] args) throws IOException {

		result(5);
		
		//System.out.println(isPrime(4));

	}
}
