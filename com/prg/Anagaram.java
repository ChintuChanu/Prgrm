package com.prg;

import java.util.Arrays;

public class Anagaram {
	
	public static void main(String[] args) {
		String s="Prashant";
		String s1="Tnahsarp";
		String case1 = s.toLowerCase();
		String case2 = s1.toLowerCase();
		char[] cs = case1.toCharArray();
		char[] cs2 = case2.toCharArray();
		Arrays.sort(cs);
		Arrays.sort(cs2);
		if (Arrays.equals(cs, cs2)) {
			System.out.println("Anagram");
			
		}else {
			System.out.println("Not Anagram");
		}
	}

}
