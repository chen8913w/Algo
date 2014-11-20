package org.practice.leetcode.IntegerRoman;
public class Solution {
    public String intToRoman(int num) {
        if(num < 1 || num > 3999){  
            return "-1";  
        }  
   
        int[] aArray = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
        String[] rArray = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
        StringBuffer rNumber = new StringBuffer();  
   
        for(int i=0; i<aArray.length; i++){  
            while(num >= aArray[i]){  
                rNumber.append(rArray[i]);  
                num -= aArray[i];  
            }  
        }  
   
        return rNumber.toString();  
    }  
}
