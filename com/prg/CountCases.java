package com.prg;

public class CountCases {
	public static void main(String[] args) {
		String s= "Azarara321@gmail.com";
		int up=0,lo=0,num=0,spe=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c>=97 && c<=122) {
				lo++;
			}else if(c>=65&& c<=90) {
				up++;
			}
		
	}System.out.println(up);
	System.out.println(lo);

}
}
