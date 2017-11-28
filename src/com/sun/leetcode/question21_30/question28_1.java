package com.sun.leetcode.question21_30;

public class question28_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr2("mississippi","j"));
	}
    public static int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++) {
        	if(beginWith(haystack.substring(i,haystack.length()),needle)){
        		return i;
        	}
        }
        return -1;
    }
    
    public static boolean beginWith(String a,String b) {
    	if(b.length()>a.length()) return false;
    	if(b.length()==0) return true;
    	if(a.length()==0) return false;
    	if(a.charAt(0)==b.charAt(0))	
    		return beginWith(a.substring(1,a.length()),b.substring(1, b.length()));
    	return false;
    }
    
    public static int strStr2(String haystack, String needle) {
    	if(haystack.equals(needle)) return 0;
        for(int i=0;i<haystack.length()-needle.length()+1;i++) {
        	String temp = haystack.substring(i, i+needle.length());
        	
        	if(temp.equals(needle)){
        		return i;
        	}
        }
        return -1;
    }
}
