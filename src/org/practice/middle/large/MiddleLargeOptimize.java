package org.practice.middle.large;

public class MiddleLargeOptimize {
	public int middleLargeOptimize(int[] A) {
		int result = 0;
		for (int i = 1; i < A.length; i++) {
			int left = 0, right = 0;
			for (int j = 0; j < A.length; j++) {
				if (j == i)
					continue;
				if (A[j] < A[i] && j < i)
					left++;
				if (A[j] < A[i] && j > i)
					right++;
			}
			result += left * right;
		}
		return result;
	}
}
