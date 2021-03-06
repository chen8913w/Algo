package org.practice.leetcode.medianoftwosortedarray;

public class Solution {
	public double findMedianSortedArrays(int A[], int B[]) {
		if (A == null || B == null)
			throw new NullPointerException("Please input the correct String");
		int m = A.length;
		int n = B.length;
		if ((m + n) % 2 != 0) {
			return (double) findKth(A, B, (m + n) / 2, 0, m - 1, 0, n - 1);
		} else {
			return (findKth(A, B, (m + n) / 2, 0, m - 1, 0, n - 1) + findKth(A,
					B, (m + n) / 2 - 1, 0, m - 1, 0, n - 1)) * 0.5;
		}
	}

	public int findKth(int[] A, int[] B, int k, int aStart, int aEnd,
			int bStart, int bEnd) {
		int aLen = aEnd - aStart + 1;
		int bLen = bEnd - bStart + 1;

		// handle special cases
		if (aLen == 0)
			return B[bStart + k];
		if (bLen == 0)
			return A[aStart + k];
		if (k == 0)
			return A[aStart] < B[bStart] ? A[aStart] : B[bStart];
		// get a and b's middle count
		int aMid = aLen * k / (aLen + bLen);
		int bMid = k - aMid - 1;

		aMid = aMid + aStart;
		bMid = bMid + bStart;
		if (A[aMid] > B[bMid]) {
			k = k - (bMid - bStart + 1);
			aEnd = aMid;
			bStart = bMid + 1;
		} else {
			k = k - (aMid - aStart + 1);
			bEnd = bMid;
			aStart = aMid + 1;
		}
		return findKth(A, B, k, aStart, aEnd, bStart, bEnd);
	}
}