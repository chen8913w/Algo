package org.practice.preorder.recovery;
import java.util.HashMap;

import javax.swing.tree.TreeNode;

public class PreorderRecovery {
	public TreeNode preorderRecovery(String str) {
		if (str == null || str.length() == 0 || str.charAt(0) == '#')
			return null;
		// 1)hashmap to map the node and its parent node
		// 2)count to record the node and its count number when building its
		// child node. If the count ==1, means only left child.
		// If count==2, means two children has been assigned.

		HashMap<TreeNode, TreeNode> hashmap = new HashMap<TreeNode, TreeNode>();
		HashMap<TreeNode, Integer> count = new HashMap<TreeNode, Integer>();
		TreeNode root = new TreeNode(str.charAt(0));
		TreeNode preroot = root;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != '#') {
				TreeNode newNode = new TreeNode(str.charAt(i));
				if (str.charAt(i - 1) != '#') {
					root.left = newNode;
				} else {
					root.right = newNode;
				}
				if (count.containsKey(root)) {
					count.put(root, 2);
				} else {
					count.put(root, 1);
				}
				root = newNode;
				hashmap.put(newNode, root);
			}
			if (str.charAt(i) == '#' && str.charAt(i - 1) == '#') {
				root = hashmap.get(root);
				while (count.containsKey(root) && count.get(root) == 2) {
					root = hashmap.get(root);
				}
			}
		}
		return preroot;
	}
}
