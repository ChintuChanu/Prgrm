package com.prg;

public class StringReversal {
	public static void main(String[] args) {
		String s="Madam";
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
			char c = s.charAt(i);
			rev=rev+c;
			
			
		}if (rev.equalsIgnoreCase(s)) {
			System.out.println("palindrome");
			
		}else {
			System.out.println("Not Palindrome");
		}
	}
	


}
