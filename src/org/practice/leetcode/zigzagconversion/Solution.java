package org.practice.leetcode.zigzagconversion;
public class Solution {
    String convert(String s, int nRows){
        if(nRows<=1) return s;
        StringBuffer result = new StringBuffer();
        if(s.length()==0) return "";
        for(int i=0;i<nRows;i++){
            for(int j=0,index =i; index<s.length();j++,index=(2*nRows-2)*j+i){
                result.append(s.charAt(index));
                if(i==0||i==nRows-1) continue;
                if(index+(nRows- i-1)*2 < s.length()) result.append(s.charAt(index+(nRows- i-1)*2));                
            }
        }
        return result.toString();
    }
}