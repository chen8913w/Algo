package org.practice.leetcode.addtwonumbers;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode res = new ListNode(0);
		ListNode first = res;
		int carry = 0;
		ListNode cur1 = l1, cur2 = l2;
		while (cur1 != null || cur2 != null) {
			if (cur1 != null) {
				carry += cur1.val;
				cur1 = cur1.next;
			}
			if (cur2 != null) {
				carry += cur2.val;
				cur2 = cur2.next;
			}
			ListNode newnode = new ListNode(carry % 10);
			res.next = newnode;
			res = newnode;
			carry = carry / 10;
		}
		if (carry == 1)
			res.next = new ListNode(1);
		return first.next;
	}
}