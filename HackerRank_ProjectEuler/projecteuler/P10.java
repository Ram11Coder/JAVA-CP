package projecteuler;

public class P10 {
	public static void main(String[] args) {

		System.out.println(findSumOfPrimes(2_000_000));

	}

	private static long findSumOfPrimes(int limit) {
		long sum = 0;
		for (int i = 2; i < limit; i++)
			if (isPrime(i))
				sum += i;
		return sum;
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
