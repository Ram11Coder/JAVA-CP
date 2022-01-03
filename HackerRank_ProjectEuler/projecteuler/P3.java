package projecteuler;

/**
 * Largest prime factor Problem 3 The prime factors of 13195 are 5, 7, 13 and
 * 29.
 * 
 * What is the largest prime factor of the given number ?
 *
 * 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class P3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			System.out.println(findPrime(n));
		}
		in.close();
	}

	private static long findPrime(long n) {

		long maxPrime = -1;

		while (n % 2 == 0) {
			maxPrime = 2;
			n >>= 1;
		}
		while (n % 3 == 0) {
			maxPrime = 3;
			n /= 3;
		}

		for (int i = 5; i <= Math.sqrt(n); i += 6) {
			while (n % i == 0) {
				maxPrime = i;
				n /= i;
			}

			while (n % (i + 2) == 0) {
				maxPrime = i + 2;
				n /= (i + 2);
			}
		}

		if (n > 4)
			maxPrime = n;

		return maxPrime;
	}
}