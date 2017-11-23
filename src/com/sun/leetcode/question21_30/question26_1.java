package com.sun.leetcode.question21_30;

public class question26_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {};
		System.out.println(removeDuplicates(array));
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	

	public static int removeDuplicates(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			while (i + 1 < nums.length && nums[i + 1] == nums[i]) {
				i++;
			}
			nums[res]=nums[i];
			res++;
		}
		return res;
	}
}
