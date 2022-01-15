package projecteuler;

import java.math.BigInteger;
import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		BigInteger sum = BigInteger.ZERO;
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			BigInteger n = in.nextBigInteger();
			sum = sum.add(n);
		}
		System.out.println(String.valueOf(sum).substring(0, 10));
		in.close();

	}

}
