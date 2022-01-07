package projecteuler;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class P7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			PrimeFinder(n);
		}
		in.close();

	}

	private static void PrimeFinder(int n) {
		int count = 0;
		for (int i = 2; i <= Integer.MAX_VALUE; i++) {
			if (isPrime(i))
				count++;
			if (count == n) {
				System.out.println(i);
				break;
			}
		}
	}

	private static boolean isPrime(int n) {
		if (n <= 1)
			return false;

		if (n <= 3)
			return true;

		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i += 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}
}
