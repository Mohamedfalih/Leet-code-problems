class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int s = 0;
        int e = k - 1;

        double wSum = 0;
        double maxSum = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < k; i++) {
            wSum += nums[i];
        }
        maxSum = Math.max(maxSum, wSum);

        while (e < nums.length - 1) {
            
            wSum += nums[++e] - nums[s++];
            maxSum = Math.max(maxSum, wSum);
        }
        return maxSum / k;
    }
}