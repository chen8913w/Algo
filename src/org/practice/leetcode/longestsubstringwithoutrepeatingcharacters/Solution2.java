package org.practice.leetcode.longestsubstringwithoutrepeatingcharacters;

import java.util.HashMap;

//DP Solution. Use 

public class Solution2 {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0){
			return 0;
		}
		int[] start = new int[s.length()];
		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();

		int max = 1;
		int len;
		start[0] = 0;
		hash.put(s.charAt(0), 0);
		for (int i = 1; i < s.length(); i++) {
			if (hash.containsKey(s.charAt(i))
					&& hash.get(s.charAt(i)) >= start[i - 1]) {
				start[i] = hash.get(s.charAt(i)) + 1;
			} else {
				start[i] = start[i - 1];
			}
			hash.put(s.charAt(i), i);
			len = i - start[i] + 1;
			if (len > max){
				max = len;
			}
		}
		return max;
	}
}