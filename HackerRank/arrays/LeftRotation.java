package arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class LeftRotation {
	/*
	 * Complete the 'rotateLeft' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER d 2. INTEGER_ARRAY arr
	 * 
	 * Approach 1
	 */

	/*
	 * public static List<Integer> rotateRight(int d, List<Integer> arr) { int size
	 * = arr.size(); for (int i = 0; i < d; i++) { int n = arr.get(size - 1); for
	 * (int j = size - 1; j > 0; j--) { arr.set(j, arr.get(j - 1)); } arr.set(0, n);
	 * } return arr; }
	 * 
	 * public static List<Integer> rotateLeft(int d, List<Integer> arr) {
	 * 
	 * int size = arr.size(); if (d == size) { return arr; } if (d <= (size / 2)) {
	 * for (int i = 0; i < d; i++) { int n = arr.get(0); for (int j = 0; j < size -
	 * 1; j++) { arr.set(j, arr.get(j + 1)); } arr.set(size - 1, n); } } else {
	 * return rotateRight(size % d, arr); }
	 * 
	 * }
	 */
	/**
	 * Approach 2 Optimised approach 
	 * 
	 * Time and space complexity - O(n)
	 *
	 */
	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		int n = arr.size();
		List<Integer> newArr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			newArr.add(arr.get((i + n + d) % n));
		}
		return newArr;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int d = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> result = LeftRotation.rotateLeft(d, arr);
		System.out.println(result);
		// bufferedWriter.write(result.stream().map(Object::toString).collect(joining("
		// ")) + "\n");

		bufferedReader.close();
		// bufferedWriter.close();
	}
}
