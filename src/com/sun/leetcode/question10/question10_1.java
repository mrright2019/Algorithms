package com.sun.leetcode.question10;

public class question10_1 {

	public static void main(String args[]) {
		System.out.println(isMatch("aaa","a*a"));
	}
    public static boolean isMatch(String s, String p) {
        int sLen = s.length();  
        int pLen = p.length();  
        if(pLen == 0) return sLen == 0;  
        if(pLen == 1){  
            if(p.equals(s) || p.equals(".") && s.length() == 1) return true;  
            else return false;  
        }  
        if(p.charAt(pLen-1) != '*' && p.charAt(pLen-1) != '.' && !s.contains(p.substring(pLen-1))) return false;  
        if(p.charAt(1) == '*'){  
            //p的下个字符是'*'，如果p和s当前字符相同或p当前字符是'.'，则一直往右移动  
            while (s.length() > 0 && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.' )){  
                if(isMatch(s,p.substring(2))) return true;  
                s = s.substring(1);  
            }  
            return isMatch(s,p.substring(2));  
        }  
        else{  
            //p的下个字符不是'*'，如果p和s当前字符相同或p当前字符是'.'，则p和s往右移动一个字符  
            if(s.length() > 0 && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')){  
                return isMatch(s.substring(1),p.substring(1));  
            }  
            return false;  
        }  
    }
}
