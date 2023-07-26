// Question Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

// Approach 1 : Using set to store unique element
// TC: O(n+k), SC: O(k) where n = no. of element in nums, k = no. of unique element in nums
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        int k = set.size();
        int i=0;

        for(Integer value : set) {
            nums[i++] = value;
        }

        return k;
    }
}

// Approach 2 : Two pointer approach
// TC: O(n), SC: O(1) where n = no. of element in nums
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0, j=0;

        while(j < n) {
            if(nums[i] == nums[j]) {
                j++;
            }else {
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }
}
