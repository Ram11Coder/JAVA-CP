package projecteuler;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class P11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] grid = new int[20][20];
		for (int grid_i = 0; grid_i < 20; grid_i++) {
			for (int grid_j = 0; grid_j < 20; grid_j++) {
				grid[grid_i][grid_j] = in.nextInt();
			}
		}
		System.out.println(adjacentProductOf4(grid, 4));
	}

	private static int adjacentProductOf4(int[][] mat, int n) {
		int max1 = (maxHorizontal(mat, n) > maxVertical(mat, n)) ? maxHorizontal(mat, n) : maxVertical(mat, n);
		int max2 = (upperDiagonal(mat, n) > lowerDiagonal(mat, n)) ? upperDiagonal(mat, n) : lowerDiagonal(mat, n);
		return (max1 > max2) ? max1 : max2;
	}

	private static int lowerDiagonal(int[][] mat, int n) {
		int max = Integer.MIN_VALUE, sum = 0;
		for (int i = mat.length - n; i >= 0; i--) {
			for (int j = 0, t = i; j < mat.length - i - (n - 1); j++, t++) {
				sum = mat[t][j] * mat[t + 1][j + 1] * mat[t + 2][j + 2] * mat[t + 3][j + 3];
				if (max < sum)
					max = sum;
			}
		}

		for (int i = 1; i <= mat.length - n; i++) {
			for (int j = 0, t = i; j < mat.length - i - (n - 1); j++, t++) {
				sum = mat[j][t] * mat[j + 1][t + 1] * mat[j + 2][t + 2] * mat[j + 3][t + 3];
				if (max < sum)
					max = sum;
			}
		}
		return max;
	}

	private static int upperDiagonal(int[][] mat, int n) {
		int max = Integer.MIN_VALUE, sum = 0;
		for (int i = n - 1; i < mat.length; i++) {
			for (int j = 0, t = i; j <= i - (n - 1); j++, t--) {
				sum = mat[t][j] * mat[t - 1][j + 1] * mat[t - 2][j + 2] * mat[t - 3][j + 3];
				if (max < sum)
					max = sum;
			}
		}

		for (int i = 1; i <= mat.length - n; i++) {
			for (int j = mat.length - 1, t = i; j >= n + i - 1; j--, t++) {
				sum = mat[j][t] * mat[j - 1][t + 1] * mat[j - 2][t + 2] * mat[j - 3][t + 3];
				if (max < sum)
					max = sum;
			}
		}
		return max;
	}

	private static int maxVertical(int[][] mat, int n) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < mat.length; i++) {
			int sum = 0;
			for (int j = 0; j <= mat.length - n; j++) {
				sum = (mat[j][i] * mat[j + 1][i] * mat[j + 2][i] * mat[j + 3][i]);
				if (max < sum)
					max = sum;
			}
		}
		return max;
	}

	private static int maxHorizontal(int[][] mat, long n) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < mat.length; i++) {
			int sum = 0;
			for (int j = 0; j <= mat.length - n; j++) {
				sum = (mat[i][j] * mat[i][j + 1] * mat[i][j + 2] * mat[i][j + 3]);
				if (max < sum)
					max = sum;
			}
		}
		return max;
	}
}
