// Question Link : https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

// sort the array and calculate the min and max difference and choose the minimum
// TC: O(nlogn), SC: O(1)

class Solution {
    public long findMinDiff (ArrayList<Integer> a, int n, int m) {
        if(n == 0 || m == 0) {
            return 0;
        }
        
        if(n < m) {
            return -1;
        }
        
        long minDiff = Integer.MAX_VALUE;
        Collections.sort(a);
        for(int i=0; i<n-m+1; i++) {
            minDiff = Math.min(minDiff, a.get(i+m-1) - a.get(i));
        }
        
        return minDiff;
        
    }
}
