package org.practice.leetcode.atoi;

public class Solution {
    public int atoi(String str) {
        if (str == null)
            throw new IllegalArgumentException("string is null");
        String s = str.trim();
        if (s.length() == 0) {
            return 0;
        }
        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;

        int sign = 1;
        int res = 0;
        int i = 0;

        if (s.charAt(0) == '-') {
            sign = -1;
            ++i;
        } else if (s.charAt(0) == '+') {
            ++i;
        }
        for (; i < s.length(); i++) {
            char digit = s.charAt(i);
            if (digit >= '0' && digit <= '9') {
                if (digit >= '0' && digit <= '9') {
                    if (res > MAX / 10 || digit - '0' > MAX - res * 10) {
                        return sign == -1 ? MIN : MAX;
                    }
                    res = res * 10 + (digit - '0');
                } else {
                    break;
                }
            }
        }
        return sign * res;
    }
}