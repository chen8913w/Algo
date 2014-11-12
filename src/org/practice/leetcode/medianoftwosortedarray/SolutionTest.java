package org.practice.leetcode.medianoftwosortedarray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
	@Test
	public void test() {
		int[] testcase1A = { 2, 7, 11, 15 };
		int[] testcase1B ={1,3,8,12};
		int[] testcase2A = { 2, 7, 11, 15 };
		int[] testcase2B={};
		int[] testcase3A = { 2, 7, 11, 15 };
		int[] testcase3B=null;

		assertEquals(7.5, new Solution().findMedianSortedArrays(testcase1A, testcase1B),0.001);
		assertEquals(9, new Solution().findMedianSortedArrays(testcase2A, testcase2B),0.001);

		try {
			assertEquals(9, new Solution().findMedianSortedArrays(testcase3A, testcase3B),0.001);
		} catch (Exception e) {
			System.out.println(" " + e.getMessage());
		}
	}
}
