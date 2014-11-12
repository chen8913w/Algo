package org.practice.leetcode.twosum;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
	@Test
	public void test() {
		int[] testcase1 = { 2, 7, 11, 15 };
		int target1 = 9;
		int[] testcase2 = { 2, 7, 11, 15 };
		int target2 = 14;
		int[] result = new int[2];
		result[0] = new Solution().twoSum(testcase1, target1)[0];
		result[1] = new Solution().twoSum(testcase1, target1)[1];
		assertEquals(1, result[0]);
		assertEquals(2, result[1]);

		try {
			new Solution().twoSum(testcase2, target2);
		} catch (Exception e) {
			System.out.println(target2 + " " + e.getMessage());
		}
	}
}
			