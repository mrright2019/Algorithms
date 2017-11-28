package com.sun.leetcode.question41_50;

public class question48_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {	{ 5, 1, 9,11},
				  { 2, 4, 8,10},
				  {13, 3, 6, 7},
				  {15,14,12,16}		};
		rotate(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
				System.out.print(arr[i][j]+"\t");
			System.out.println();
		}
	}
    public static void rotate(int[][] matrix) {
//        int row = 0;
        for(int row=0;row<matrix.length/2;row++) {
        	for(int col = row;col<matrix.length-row-1;col++)
        		exchange(matrix,row,col);
        }
    }
    public static void exchange(int [][]matrix,int row,int col) {
    	int d1 = matrix[row][col];
    	int d2 = matrix[col][matrix.length-1-row];
    	int d3 = matrix[matrix.length-1-row][matrix.length-1-col];
    	int d4 = matrix[matrix.length-1-col][row];
    	matrix[row][col] = d4;
    	matrix[col][matrix.length-1-row] = d1;
    	matrix[matrix.length-1-row][matrix.length-1-col] = d2;
    	matrix[matrix.length-1-col][row] = d3;
    }
}
