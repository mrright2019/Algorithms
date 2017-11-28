package com.sun.leetcode.questions;

public class question69_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqrt(2147395599));
	}
	public static int sqrt(int x) {
//		if(x<=1)	return x;
		int temp = 46340;
		while(temp>0) {
			
			long res=temp*temp;
			if(res<=x) {
				return temp;
			}
			temp--;
		}
		return 0;
		
	}
}
