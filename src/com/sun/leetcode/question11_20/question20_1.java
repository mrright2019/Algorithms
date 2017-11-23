package com.sun.leetcode.question11_20;

public class question20_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("(([]){})"));
	}
    public static boolean isValid(String s) {
        int index=0;
        int len = s.length();
        if(len%2==1) return false;
        if(s.length()==0) return true;
        char f = s.charAt(0);
        int t=0;
        int i=1;
        for( i=1;i<len;i++) {
        	if(s.charAt(i)==f) t++;
        	if(t==0 && (f-s.charAt(i)==-1||f-s.charAt(i)==-2)) {
        		if(!isValid(s.substring(1,i))) {
        			return false;
        		}
                if(!isValid(s.substring(i+1,len))) return false;
                else {
                	return true;
                }
        	}
        	if(f-s.charAt(i)==-1||f-s.charAt(i)==-2)	t--;
        }
//        if(i==len-1) return true;
        return false;
    }
}
