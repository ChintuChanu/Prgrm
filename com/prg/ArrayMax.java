package com.prg;

public class ArrayMax {
	public static void main(String[] args) {
		int [] a =new int[7];
		a[0]=400;
		a[1]=800;
		a[2]=700;
		a[3]=600;
		a[4]=500;
		a[5]=100;
		a[6]=300;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		System.out.println(a[1]);
	}

}
