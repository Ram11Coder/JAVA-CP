package projecteuler;

import java.util.Scanner;

public class P21 {
	static int count;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			totalAmicableNumberUnderN(n);
		}
		in.close();
	}

	private static void totalAmicableNumberUnderN(int num) {
		int sum = 0;
		for (int j = 220; j <= num; j++) {
			int num1 = amicableDivisor(j);

			if (amicableDivisor(num1) == j && num1 != j) {
				sum += j;
			}
		}
		System.out.println(sum);

	}

	/*
	 * private static int amicableDivisor(int div) { int divisorSum = 0; for (int i
	 * = 1; i <= div / 2; i++) if (div % i == 0) divisorSum += i;
	 * 
	 * return divisorSum; }
	 */
	private static int amicableDivisor(int num) {
		int n = num;
		count = 0;
		int divisorSum = 1;

		if (num % 2 == 0) {
			while (num % 2 == 0) {
				count++;
				num >>= 1;
			}
			divisorSum *= powerCount(2);
		}

		if (num % 3 == 0) {
			while (num % 3 == 0) {
				count++;
				num /= 3;
			}
			divisorSum *= powerCount(3);
		}

		for (int i = 5; i <= Math.sqrt(num); i += 6) {
			if (num % i == 0) {
				while (num % i == 0) {
					count++;
					num /= i;
				}
				divisorSum *= powerCount(i);
			}
			if (num % (i + 2) == 0) {
				while (num % (i + 2) == 0) {
					count++;
					num /= (i + 2);
				}
				divisorSum *= powerCount(i + 2);
			}
			if (num == 1)
				break;
		}
		if (num > 4) {
			count = 1;
			divisorSum *= powerCount(num);
		}
		return divisorSum - n;
	}

	private static int powerCount(int i) {
		int val = (int) (Math.pow(i, count + 1) - 1) / (i - 1);
		count = 0;
		return val;
	}
}
