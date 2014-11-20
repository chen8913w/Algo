package org.practice.leetcode.longestcommonprefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        boolean b = true;
        if (strs == null || strs.length == 0)
            return sb.toString();
        for (int j = 0; j < strs[0].length(); j++) {
            for (int i = 0; i < strs.length; i++) {
                if (j >= strs[i].length()
                        || strs[i].charAt(j) != strs[0].charAt(j)) {
                    b = false;
                    break;
                }
            }
            if (b == false) {
                break;
            } else {
                sb.append(strs[0].charAt(j));
            }
        }
        return sb.toString();
    }
}