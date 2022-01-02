package projecteuler;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			System.out.println(solver(n));
		}

	}

	private static long solver(long n) {
		long a = 0, b = 1, c = a + b, sum = 0;
		while (c <= n) {
			if (c % 2 == 0)
				sum += c;
			a = b;
			b = c;
			c = a + b;
		}
		return sum;
	}
}
