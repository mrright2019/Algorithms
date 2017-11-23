package com.sun.leetcode.question21_30;

public class question27_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int removeElement(int[] nums, int val) {
		int result = 0;
		int index = 0;
		while (index < nums.length) {
			if (nums[index] != val)
				nums[result++] = nums[index];
			index++;
		}
		return result;
	}
}
