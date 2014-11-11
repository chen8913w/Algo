package org.practice.preorder.recovery;

public class PreorderRecoveryTest {
	private static void pre_traverse(TreeNode pTree, StringBuffer sb) {
		if (pTree != null) {
			// sb.append(pTree.val);
			System.out.print(pTree.val);
			if (pTree.left != null)
				pre_traverse(pTree.left, sb);
			if (pTree.right != null)
				pre_traverse(pTree.right, sb);
		}
	}

	public static void main(String[] args) {
		PreorderRecovery test = new PreorderRecovery();
		String input = "ABD##EF##G##C##";
		TreeNode newTree = test.preorderRecovery(input);
		StringBuffer sb = new StringBuffer();
		pre_traverse(newTree, sb);
		System.out.println(sb.toString());

	}
}
