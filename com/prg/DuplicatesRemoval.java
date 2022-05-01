package com.prg;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesRemoval {

	public static void main(String[] args) {
		int [] a =new int[7];
		a[0]=400;
		a[1]=800;
		a[2]=400;
		a[3]=600;
		a[4]=500;
		a[5]=100;
		a[6]=500;
		Set<Integer> s=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			boolean add = s.add(a[i]);
			
		}
		for (Integer integer : s) {
			System.out.println(integer);
			
		}

	}

}
