package org.practice.leetcode.containerwithmostwater;

public class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;
        int area = 0;
        while (i < j) {
            if (height[i] < height[j]) {
                area = height[i] * (j - i);
                i++;
            } else {
                area = height[j] * (j - i);
                j--;
            }
            if (area > maxArea)
                maxArea = area;
        }
        return maxArea;
    }
}