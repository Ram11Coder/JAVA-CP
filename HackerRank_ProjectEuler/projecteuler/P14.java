package projecteuler;

public class P14 {
	public static void main(String[] args) {
		findLargestSequence(1_000_000);
	}

	private static long findLargestSequence(long n) {
		long maxCount = Long.MIN_VALUE;
		long num = 0;
		for (long i = 2; i <= n; i++) {
			long count = collatz_sequence(i);
			if (maxCount < count) {
				maxCount = count;
				num = i;
				// System.out.println("Max Number seq " + num + " Count " + maxCount);
			}
		}

		System.out.println("Max Number seq " + num + " Count " + maxCount);
		return maxCount;
	}

	private static long collatz_sequence(long i) {
		int count = 0;
		while (i != 1) {
			if (i % 2 == 0)
				i /= 2;
			else
				i = 3 * i + 1;
			count++;
		}

		return count;
	}

}
