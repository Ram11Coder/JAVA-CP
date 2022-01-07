package projecteuler;

import java.util.Scanner;

public class P8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		String num = in.next();
		solver(n, k, num);
	}

	private static void solver(int n, int k, String number) {
		long maxProd = Long.MIN_VALUE;
		for (int i = 0; i < n - k; i++) {
			long product = getProduct(number.substring(i, k + i).toCharArray());

			if (maxProd < product)
				maxProd = product;

		}
		System.out.println(maxProd);
	}

	private static long getProduct(char[] charArray) {
		long sum = 1;
		for (char c : charArray) {
			sum *= Integer.parseInt(c + "");
		}
		return sum;
	}
}
