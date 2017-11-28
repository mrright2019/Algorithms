package com.sun.leetcode.question11_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> res = threeSum(array);
		for(int i=0;i<res.size();i++) {
			List<Integer> t = res.get(i);
			System.out.print(t.get(0)+"\t");
			System.out.print(t.get(1)+"\t");
			System.out.print(t.get(2)+"\n");
		}
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {

			if (nums[i] > 0)
				break;
			if(i>0 && nums[i-1]==nums[i] )
				continue;
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				if (nums[i] + nums[j] + nums[k] == 0) {
					int temp1 = nums[j];
					int temp2 = nums[k];
					List<Integer> t = new ArrayList<Integer>();
					t.add(nums[i]);
					t.add(nums[j]);
					t.add(nums[k]);
					res.add(t);
					while(temp1 == nums[j] && j<k) j++;
					while(temp2 == nums[k] && j<k) k--;
				}
				else if (nums[i] + nums[j] + nums[k] > 0) {
					k--;
				}
				else {
					j++;
				}
			}
		}
		return res;
	}

}
