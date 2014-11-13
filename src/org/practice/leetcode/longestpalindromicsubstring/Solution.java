package org.practice.leetcode.longestpalindromicsubstring;

public class Solution {
	public String longestPalindrome(String s) {
		if (s == null || s.length() == 0){
			return null;
		}
		int[][] dp = new int[s.length()][s.length()];
		dp[0][0] = 1;
		int max = 1;
		String maxString = s.substring(0, 1);
		char pre = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			dp[i][i] = 1;
			if (s.charAt(i) == pre) {
				dp[i - 1][i] = 1;
				max = 2;
				maxString = s.substring(i - 1, i + 1);
			}
			pre = s.charAt(i);
		}
		for (int m = 2; m < s.length(); m++) {
			for (int i = 0; i < s.length() - m; i++) {
				if (dp[i + 1][i + m - 1] == 1 && s.charAt(i) == s.charAt(i + m)) {
					dp[i][i + m] = 1;
					if (m + 1 > max) {
						max = m + 1;
						maxString = s.substring(i, i + m + 1);
					}
				}
			}
		}
		return maxString;
	}

}