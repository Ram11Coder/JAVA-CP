import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String word = sc.next();
			System.out.println(abbrevateWords(word));
		}
		sc.close();
	}

	private static String abbrevateWords(String word) {
		int len = word.length();
		if (len > 10) 
			return word.substring(0, 1) + (len - 2) + word.substring(len - 1);
		
		return word;
	}
}
