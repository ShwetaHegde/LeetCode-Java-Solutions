/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/

//Author : Shweta Hegde

import java.util.Arrays;

public class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        int halfArrayLength = nums.length / 2;
        for (int i = 0 ; i < nums.length ; ++i) {
            
            if (nums[i] == nums[i + halfArrayLength]) {
                
                return nums[i];
            }  
        }
        return 0;
    }
}
