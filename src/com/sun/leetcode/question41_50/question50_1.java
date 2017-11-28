package com.sun.leetcode.question41_50;

public class question50_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public double myPow(double x, int n) {
        int sign=1;
        if(n<0){
            sign=-1;
            n=-n;
        }
        return sign<0? 1/pow(x,n) : pow(x,n) ;
    }
        
        
    public double pow(double x,int n){
        if(n==0) return 1;
        if(n==1) return x;
        if(n%2==0) {
            double tmp=pow(x,n/2);
            return tmp*tmp;
        }else{
            double tmp=pow(x,n/2);
            return tmp*tmp*x;
        }
    }
}
