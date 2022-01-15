package projecteuler;

import java.math.BigInteger;
import java.util.Scanner;

public class P16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			sumOfDigits(n);
		}
		in.close();
	}

	private static void sumOfDigits(int n) {
		int sum = 0;
		BigInteger bi1 = BigInteger.TWO.pow(n);
		String s[] = String.valueOf(bi1).split("");
		for (String str : s)
			sum += Integer.parseInt(str);

		System.out.println(sum);
	}
}
