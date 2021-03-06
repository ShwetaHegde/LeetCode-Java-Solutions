/*
Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of 
nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
*/

//Author : Shweta Hegde

public class Solution {
    public int removeDuplicates(int[] nums) {
        
        if ( nums.length <= 2 )  return nums.length;
        
        int pos = 0; 
        int count = 1;
        
        for ( int i = 1; i < nums.length; ++i ) {
            
            if ( nums[i] == nums[pos] ) {
                
                if ( count < 2 ){
                    
                    nums[++pos] = nums[i];
                    count++;
                }
            }
            else {
                
                count = 1;
                nums[++pos] = nums[i];
            }
        }
        return ++pos;
    }
}