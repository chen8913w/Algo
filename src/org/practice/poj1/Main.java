package org.practice.poj1;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        PrintWriter cout = new PrintWriter(System.out);
        while(sc.hasNext()!=false){
            String[] originals = sc.nextLine().split(" ");
            if(originals.length==1&&originals[0].equals("0")) break;
            if(originals.length==1)continue;
            
            int[] original = new int[originals.length];            
            for(int i=0;i<originals.length;i++){
                original[i]=Integer.parseInt(originals[i]);
            }
            
            Arrays.sort(original);
            boolean cutonce=false;
            boolean[] visited = new boolean[original.length];  
            int sum=0;
            for(int i=0;i<original.length;i++){
                sum+=original[i];
            }
            
            for (int target =original[original.length-1]+original[0];target <sum/2+1;target++){
                int[] result=new int[1];
                smallestnumber(original,visited,0,target,result);
                
                if(result[0]==1) {
                    cutonce=true;
                    cout.println(target);
                    break;
                }
            }
            if(cutonce==false) cout.println(sum);
        }
        cout.flush();
    }
    
    static void smallestnumber(int[] original,boolean[] visited,int current, int target,int[] result){
        if(current==target){
            for(int i=0;i<visited.length;i++){
                if(visited[i]==false) break;
                result[0]=1;
                return;
            }
            current=0;
        }
        if(current>target) return; 
        for(int i=0;i<original.length;i++){
                if(visited[i]!=true){
                    visited[i]=true;
                    smallestnumber(original,visited, current+original[i],target,result);
                    visited[i] = false;
                        }
        }
    }
}
