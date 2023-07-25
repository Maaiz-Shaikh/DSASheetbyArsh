// Question Link : https://leetcode.com/problems/find-the-duplicate-number/description/

// Approach 1: Using HashSet to identify duplicate
// TC: O(n), SC: O(n)
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length, duplicate = 0;
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<n; i++) {
            if(set.contains(nums[i])) {
                duplicate = nums[i];
                break;
            }
            set.add(nums[i]);
        }

        return duplicate;
    }
}

// Approach 2: Using binary search
// TC: O(nlogn), SC: O(1)
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length, duplicate = 0;
        int low = 1, high = n-1;

        while(low <= high) {
            int mid = low + ((high - low)/2);
            int count = 0;

            for(int num : nums) {
                if(num <= mid)
                    count++;
            }

            if(count > mid) {
                duplicate = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }  
        }

        return duplicate;
    }
}
