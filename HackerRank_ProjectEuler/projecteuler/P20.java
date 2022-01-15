package projecteuler;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Factorial digit sum
 * 
 * Problem 20
 * 
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * 
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * 
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 =
 * 27.
 * 
 * Find the sum of the digits in the number 100!
 *
 */
public class P20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			System.out.println(factorialOfNumber(n));
		}
		in.close();

	}

	private static int factorialOfNumber(int num) {
		if (num == 1 || num == 0)
			return 1;
		BigInteger sum = BigInteger.ONE;

		for (int fact = 2; fact <= num; fact++)
			sum = sum.multiply(BigInteger.valueOf(fact));

		String s[] = String.valueOf(sum).split("");
		int res = 0;

		for (String str : s)
			res += Integer.parseInt(str);

		return res;
	}

}
