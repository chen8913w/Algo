package org.practice.poj1;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class poj3094 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        PrintWriter cout = new PrintWriter(System.out);
        while(sc.hasNextLine()!=false){
            String line = sc.nextLine();
            if(line.equals("#")) break;
            int result=0;
            for(int i=0;i<line.length();i++){
                if(line.charAt(i)==' ') continue;
                result+=(i+1)*(line.charAt(i)-'A'+1);
            }
            cout.println(result);
        }
        cout.flush();
    }
}
