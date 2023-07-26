// Question Link : https://leetcode.com/problems/two-sum/description/

// Approach 1 : Using 2 nested for-loops
// TC: O(n^2), SC: O(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }

        return ans;
    }
}

// Approach 2 : Using hash table/map in 2 passes
// TC: O(2n), SC: O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            map.put(nums[i], i);
        }

        for(int i=0; i<n; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) && i!=map.get(complement)) {
                ans[0] = i;
                ans[1] = map.get(complement);
                break;
            }
        }

        return ans;
    }
}

// Approach 3 : Using hash table/map in 1 passes
// TC: O(n), SC: O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) && i!=map.get(complement)) {
                ans[0] = i;
                ans[1] = map.get(complement);
                break;
            }
            map.put(nums[i], i);
        }

        return ans;
    }
}
