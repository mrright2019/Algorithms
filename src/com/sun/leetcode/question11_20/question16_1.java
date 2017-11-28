package com.sun.leetcode.question11_20;

import java.util.Arrays;

public class question16_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {0,1,2};
		System.out.println(threeSumClosest(array,3));
	}
    public static int threeSumClosest(int[] nums, int target) {
    	Arrays.sort(nums);
    	int res1 = nums[0]+nums[1]+nums[2];
    	for(int i=0;i<nums.length-2;i++) {
    		int j=i+1;
    		int k=nums.length-1;
    		int r1=nums[j]+nums[k]+nums[i];
    		while(j<k) {
    			int temp1 = nums[i]+nums[k]+nums[j];
        		int temp2 = temp1-target;
        		if(temp2==0)	return temp1;
        		if(abs(r1-target)>abs(temp1-target)) {
        			r1 = temp1;
        		}
//        		r1 = nums[i]+nums[j]+nums[k];
        		if(temp2>0) {
        			k--;
        			continue;
        		}
        		if(temp2<0) {
        			j++;
        			continue;
        		}
        		
    		}
    		if(abs(r1-target)<abs(res1-target)) {
    			res1 = r1;
    		}
    	}
    	return res1;
    }
    public static int abs(int x) {
    	return x>0?x:-x;
    }
}
