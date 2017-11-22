package com.sun.leetcode.question9;

public class question9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(123210));
	}
	static boolean isPalindrome(int x) {
        if (x<0)  
            return false;  
         long  sum =0;  
         long  origin = x;  
        while(x!=0)  
        {  
            int num = x %10;  
            sum = sum*10 + num;  
            x/=10;  
        }  
        if(sum == origin)  
            return true;  
        else  
            return false;  
	}
}
