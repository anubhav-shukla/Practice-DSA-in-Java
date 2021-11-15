package DSA;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Eko {
	public static boolean isPossible(long[] trees, int n, long m, long mid)
	{
		long height = 0;
		for (int i=0; i<n; i++) {
			if (trees[i] > mid) {
				height += trees[i]-mid;
				if (height >= m) {
					return true;
				}
			}
		}
		return false;
	}

	public static long maxHeight(long[] trees, int n, long m)
	{
		long l = trees[0];
		long r = trees[n-1];
		long res = Long.MIN_VALUE;
		while (l <= r) {
			long mid = l + (r-l)/2;
			if (isPossible(trees, n, m, mid)) {
				res = Math.max(res, mid);
				l = mid+1;
			}
			else {
				r = mid-1;
			}
		}
		return res;
	}

	public static void main(String[] args) throws IOException
	{
		// File text = new File("input.txt");
		// Scanner sc = new Scanner(text);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		long[] trees = new long[n];
		for (int i=0; i<n; i++) {
			trees[i] = sc.nextLong();
		}
		Arrays.sort(trees);
		System.out.println(maxHeight(trees, n, m));
	}
	}
