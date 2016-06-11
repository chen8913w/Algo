package org.practice.leetcode.recent;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.practice.middle.large.MiddleLargeOptimize;

public class Issue156Test {

	@Test
	public void test() {
		TreeNode one = new TreeNode (1);
		TreeNode two = new TreeNode (2);
		TreeNode three = new TreeNode (3);
		TreeNode four = new TreeNode (4);
		TreeNode five = new TreeNode (5);

		one.left=two;
		one.right= three;
		two.left=four;
		two.right=five;
		
		TreeNode newRoot = new Issue156().upsideDownBinaryTree(one);
		assertEquals(4, newRoot.val);

	}

}