package com.sun.leetcode.question8_1;

public class question8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("-9223372036854775809"));
	}

	public static int myAtoi(String str) {
		long res=0;
		long r=0;
		int sign=0;
		boolean spaceend=false;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				if(spaceend) break;
				continue;
			}
			if(str.charAt(i)=='-') {
				if(res!=0) return 0;
				if(sign==0)	sign=-1;
				else return 0;
				spaceend=true;
				continue;
			}
			if(str.charAt(i)=='+') {
				if(res!=0) return 0;
				if(sign==0) sign=1;
				else return 0;
				spaceend=true;
				continue;
			}
			spaceend=true;
			r=res;
			r*=sign==0?1:sign;
			if(r>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
			if(r<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
			if('0'<=str.charAt(i) && str.charAt(i)<='9') {
				res*=10;
				res+=str.charAt(i)-'0';
			}
			else {
				break;
			}
		}
		r=res;
		r*=sign==0?1:sign;
		if(r>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
		if(r<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
		return (int)r;
	}
}
