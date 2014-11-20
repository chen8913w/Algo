package org.practice.leetcode.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(num);
        Set<ArrayList<Integer>> sets = new HashSet<ArrayList<Integer>>();
        for(int i=0;i<num.length;i++){
            int j=i+1, k=num.length-1;
            while(j<k){
                if(num[i]+num[j]+num[k]==0){
                    ArrayList<Integer> element = new ArrayList<Integer>();
                    element.add(num[i]);
                    element.add(num[j]);
                    element.add(num[k]);
                    if(sets.add(element)){
                        res.add(element);
                    }
                    j++;
                    k--;
                }else if((num[i] + num[j] + num[k]) > 0){
                    k--;
                }
                else
                    j++;
            }
        }
        return res;
    }
}