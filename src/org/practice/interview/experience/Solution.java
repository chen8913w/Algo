package org.practice.interview.experience;

// 1 2 3 4 6 4 3 2 1
//find the index of the max number
public class Solution {
    public static int returnMax(int[] arr, int start, int end, int n) {
        int mid = start + (end - start) / 2;
        // only one element
        if (mid == 0 && mid == n - 1)
            return mid;
        if ((mid == 0 || arr[mid - 1] <= arr[mid])
                && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
            return mid;
        if (mid > 0 && arr[mid - 1] > arr[mid])
            return returnMax(arr, start, mid - 1, n);
        else
            return returnMax(arr, mid + 1, end, n);
    }
}
