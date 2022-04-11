import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solver(n));
		sc.close();
	}

	private static String solver(int n) {
		return (n <= 3 || n % 2 == 1) ? "NO" : "YES";
	}
}
