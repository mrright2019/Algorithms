package com.sun.leetcode.question7;

public class question7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(resver(123));
		System.out.println(resver(-123));
		System.out.println(resver(0));
		System.out.println(resver(-2147483648));
	}
	static long resver(int x)
	{
		
		long y=0;
	    long temp=x;
		if(temp<0) {
			temp=-temp;
		}
		while(temp/10 > 0)
		{
			y=y*10;
			y+=temp%10;
			temp/=10;
		}
		y*=10;
		y+=x%10;
		if(x<0) y=-y;
		if(y>=Integer.MAX_VALUE || y<= Integer.MIN_VALUE) {
			return 0;
		}
		return y;
	}

}
