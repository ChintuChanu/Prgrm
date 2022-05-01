package com.prg;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num=14;
		int count=0;
		for (int i = 2; i < num/2; i++) {
			if (num%i==0) {
				count++;
			}
			
		}if (count==0) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}

	}

}
