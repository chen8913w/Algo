package org.practice.middle.large;

import static org.junit.Assert.*;

import org.junit.Test;

public class MiddleLargeNaiveTest {

	@Test
	public void test() {
		int[] testcase1 = {};
		int[] testcase2 = { 1 };
		int[] testcase3 = { 1, 2, 3, 4, 1 };
		int[] testcase4 = { 1, 2, 3, 4, 1, 2 };
		assertEquals(0, new MiddleLargeNaive().middleLargeNaive(testcase1));
		assertEquals(0, new MiddleLargeNaive().middleLargeNaive(testcase2));
		assertEquals(6, new MiddleLargeNaive().middleLargeNaive(testcase3));
		assertEquals(6,
				new MiddleLargeOptimize().middleLargeOptimize(testcase3));
		assertEquals(11,
				new MiddleLargeOptimize().middleLargeOptimize(testcase4));
	}

}
