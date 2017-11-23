package com.sun.leetcode.question11_20;

public class question14_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[]= {"a","ab"};
		System.out.println( longestCommonPrefix(array) );
	}
    public static String longestCommonPrefix(String[] strs) {
        int index=0;
        if(strs.length==0) return "";
        if(strs[0].length()==0) return "";
        while(index<strs[0].length()) {
        	for(int i=1;i<strs.length;i++) {
        		if(index>=strs[i].length())	return strs[i];
        		if(strs[i].charAt(index)!=strs[0].charAt(index)) 
        			return strs[0].substring(0, index);
        	}
        	index++;
        }
		return strs[0];
    }
}
