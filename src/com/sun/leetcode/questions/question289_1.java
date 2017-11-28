package com.sun.leetcode.questions;

public class question289_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

    public void gameOfLife(int[][] board) {
        int []row = new int[board.length];
        for(int i=1;i<board.length-1;i++) {
        	
        }
    }
    public static int NumofBorad(int arr[][],int i, int j) {
    	int n=0;
    	int minp = i-1>0?i-1:0;
    	for(int p=i-1;p<=i+1;p++) {
    		for(int q=j-1;q<=j+1;q++) {
    			n+=arr[i][j];
    		}
    	}
    	return n;
    }
}
