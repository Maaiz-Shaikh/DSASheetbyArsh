// Question Link : https://leetcode.com/problems/sort-colors/description/

// Approach 1: Simply Sorting
// TC: O(nlogn), SC: O(1)

// Approach 2: Counting no. of 0's, 1's and 2's
// TC: O(2n), SC: O(1)

// Approach 3: Dutch National Flag Algorithm (3 pointers - low, mid, high)
// TC: O(n) single pass only, SC: O(1)
class Solution {
    public void sortColors(int[] nums) {
        //Dutch National Flag Algorithm
        int low=0, mid=0, high=nums.length-1;
        int temp=0;
        while(mid<=high){
            if(nums[mid]==0){
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }

        
    }
}
