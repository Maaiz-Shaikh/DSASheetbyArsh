// Question Link : https://leetcode.com/problems/move-zeroes/description/

// Approach 1 : Create an array of same size but put only non-zero elements and copy to original array
// TC: O(n), SC: O(n)
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] copy = new int[n];
        int index = 0;

        for(int i=0; i<n; i++) {
            if(nums[i] != 0) {
                copy[index++] = nums[i];
            }
        }

        for(int i=0; i<n; i++) {
            nums[i] = copy[i];
        }
    }
}

// Approach 2 : Two pointer approach + swapping
// TC: O(n), SC: O(1)
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = i+1;
        
        while(i<nums.length && j<nums.length){
            if(nums[i] == 0 && nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
                i++;
                j++;
            }else if(nums[i] != 0){
                i++;
                j=i+1;
            }else{
                j++;
            }
        }
    }
}
