package com.sun.leetcode.questions5;

public class queastion5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(longestPalindrome("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"));
	}

	public static String longestPalindrome(String s) {
		if(s==null) return null;
		if(s.length()<=1) return s;
		int maxlen = 0;
		String longestStr = null;
		int length = s.length();
		int map[][]=new int[length][length];
		for(int i=0;i<length;i++) {
			map[i][i]=1;
		}
		longestStr = s.substring(0,1);
		for(int i=0;i<=length-2;i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				map[i][i+1]=1;
				longestStr = s.substring(i, i+2);
				maxlen=2;
			}
		}
		for(int l = 3;l <=length;l++) {
			for(int i=0;i<=length-l;i++) {
				int j=i+l-1;
				if(s.charAt(i)==s.charAt(j) && map[i+1][j-1]==1) {
					map[i][j]=1;
					longestStr = s.substring(i,j+1);
				}
			}
		}
		return longestStr;
	}
}
