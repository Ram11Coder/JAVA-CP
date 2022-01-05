package projecteuler;

import java.util.Scanner;

//https://www.hackerrank.com/contests/projecteuler/challenges/euler005/problem
/**
 * Smallest multiple
 * 
 * Problem 5
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 40
 *
 */
public class P5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*
		 * for (int i = 1; i <=40; i++) { smallestMultiple(i); }
		 */
		smallestMultiple(scan.nextInt());
	}

	private static void smallestMultiple(int n) {
		long TotalSum = 1;
		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				TotalSum *= checkMultiple(i, n);
			}
		}
		System.out.println(TotalSum);

	}

	private static int checkMultiple(int i, int n) {
		int sum = i;
		while (sum <= n) {
			sum *= i;
		}
		return (sum == i) ? sum : sum / i;
	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		if (num <= 3) {
			return true;
		}
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0)
				return false;
		}
		return true;
	}

	/*
	 * private static boolean checkDivisiblebyAll20(int num) { for (int i = 2; i <=
	 * 20; i++) if (num % i != 0) return false; return true; }
	 */
}
