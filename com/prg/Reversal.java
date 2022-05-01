package com.prg;

public class Reversal {

	public static void main(String[] args) {
		int a=141;
		int temp=a;
		int rev=0;
		while (a>0) {
			int n=a%10;
			rev=(rev*10)+n;
			a=a/10;
		}
		if (rev==temp) {
			System.out.println("palindrome");
			
		}else {
			System.out.println("not palindrome");
		}

	}

}
