/*Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
*/

//Author : Shweta Hegde

public class Solution {
    public int removeElement(int[] nums, int val) {
        
        int pos = 0;
        
        for ( int i = 0; i < nums.length; ++i ) {
            
            if ( nums[i] != val ) {
                
                nums[pos] = nums[i];
                pos++;
            }
        }
        return pos;
    }
}