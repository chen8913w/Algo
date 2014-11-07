package org.practice.middle.large;

public class MiddleLargeNaive {
	public int middleLargeNaive(int[] A) {
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				for (int k = j + 1; k < A.length; k++) {
					if (A[i] < A[j] && A[k] < A[j])
						count++;
				}
			}
		}
		return count;
	}
}
