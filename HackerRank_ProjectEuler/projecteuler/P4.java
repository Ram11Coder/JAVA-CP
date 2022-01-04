package projecteuler;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class P4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			/**
			 * Given number is palindrome then check less than that
			 */
			largestPalindrome(n - 1);
		}
	}

	private static void largestPalindrome(int n) {
		int maxPalindrome = Integer.MIN_VALUE;
		for (int i = n; i >= 101101; i--) {
			if (palindromeCheck(i) && numCheck(i))
				if ((maxPalindrome < i)) {
					maxPalindrome = i;
					break;
				}
		}
		if (maxPalindrome != Integer.MIN_VALUE)
			System.out.println(maxPalindrome);

	}

	private static boolean numCheck(int n) {
		int c = 999;
		while (c >= 100) {
			int rem = n / c;
			if ((rem * c == n) && (rem >= 100 && rem <= 999))
				return true;
			c--;
		}
		return false;
	}

	private static boolean palindromeCheck(int num) {
		StringBuilder sb = new StringBuilder(num + "");
		sb = sb.reverse();
		if (sb.toString().equals(String.valueOf(num)))
			return true;
		return false;
	}
}