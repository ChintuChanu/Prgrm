package com.prg;

import java.util.HashMap;
import java.util.Map;

public class Com {
	 public static void main(String[] args) {
		 
		int a[]= {4,5,6,2,1,3,7,8,9};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			} 
				
			}for (int i : a) {
				System.out.println(i);
			
		}
		 
	
			
		}
		
		
	
	 
	 }