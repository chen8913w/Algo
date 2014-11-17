package org.practice.poj1;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class poj2945 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		PrintWriter cout = new PrintWriter(System.out);
		int number, len;

		HashMap<String, Integer> hashcount = new HashMap<String, Integer>();
		while (true) {
			number = sc.nextInt();
			len = sc.nextInt();
			sc.nextLine();
			hashcount.clear();

			if (number == 0 && len == 0) {
				break;
			}

			for (int line = 1; line <= number; line++) {
				String s = sc.nextLine();
				if (hashcount.containsKey(s)) {
					hashcount.put(s, hashcount.get(s) + 1);
				} else {
					hashcount.put(s, 1);
				}
			}
			int[] output = new int[number];
			for (Entry<String, Integer> keyset : hashcount.entrySet()) {
				output[keyset.getValue() - 1]++;
			}
			for (int i = 0; i < output.length; i++) {
				cout.println(output[i]);
			}
		}
		cout.flush();
	}
}
