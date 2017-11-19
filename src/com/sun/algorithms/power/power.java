package com.sun.algorithms.power;

public class power {

	static int power1(int x,int n) {
		int y = x;
		for(int i=1;i<n;i++) {
			y*=x;
		}
		return y;
	}
	static int power2(int x,int n) {
		if(n==0) return 1;
		int index=0;
		for(int i=1;i<=31;i++) {
			int j = n<<i;
			j = j>>31;
			if(j==-1) {
				index = i;
				break;
			}
		}
		int res = x;
		for(int i=index+1;i<=31;i++) {
			res = res*res;
			int j=n<<i;
			j = j>>31;
			if(j==-1) {
				res = res*x;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello, world");
		System.out.println(power1(2,10));
		System.out.println(power2(2,10));
	}

}
