package projecteuler;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class P25 {
	static List<BigInteger> list = new ArrayList<BigInteger>();

	public static void main(String[] args) {
		fibonacciSeries(1000);

	}

	private static void fibonacciSeries(int i) {

		
		for (int j = 0; j < i; j++) {
			
		}
		int count = 1;
		BigInteger a = BigInteger.valueOf(0), b = BigInteger.valueOf(1), c = BigInteger.valueOf(0);
		while (true) {
			c = a.add(b);
			count++;

			if (c.toString().length() >= i) {
				System.out.println(c + " -> " + count);
				break;
			}
			a = b;
			b = c;
		}

	}

}
