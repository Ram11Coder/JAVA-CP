package projecteuler;

public class P6 {
	public static void main(String[] args) {

		System.out.println(sumOfNNumbersSquare(10000) - sumOfSquareOfEachNumbersN(10000));
		// System.out.println(squareDiff(10000));
	}

	private static long sumOfNNumbersSquare(int n) {
		long sum = (n * (n + 1)) / 2;
		sum *= sum;
		return sum;
	}

	private static long sumOfSquareOfEachNumbersN(long n) {
		return n * (n + 1) * (2 * n + 1) / 6;
	}

	/*
	 * private static long squareDiff(int num) { long n = num; long sum = (n * (n +
	 * 1)) / 2; sum *= sum; return sum - (n * (n + 1) * (2 * n + 1) / 6); }
	 */
}