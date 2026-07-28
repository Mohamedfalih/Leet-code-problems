class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int current  = 0;
        int mini = nums[0];
        int total  = 0;

        int currentMax = 0;
        int maxi = nums[0];

        for(int i = 0 ; i < nums.length ; i++){

            total += nums[i];

            current += nums[i];
            mini = Math.min(mini , current);

            if(current > 0){
                current = 0;
            }

            currentMax += nums[i];
            maxi = Math.max(maxi, currentMax);

            if (currentMax < 0) {
                currentMax = 0;
            }

        }
        if (maxi < 0)
            return maxi;
        
        return Math.max(maxi , total - mini);
    }
}