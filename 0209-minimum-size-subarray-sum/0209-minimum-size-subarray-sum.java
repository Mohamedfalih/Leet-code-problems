class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int sum = nums[0];
        int start = 0;
        int end = 0;

        int minLen = Integer.MAX_VALUE;

        if(sum >= target){
            return 1;
        }
        while( end < nums.length - 1){

            end++;
            sum += nums[end];

            while( sum >= target){ 

                minLen = Math.min(end-start+1 , minLen );
                sum -= nums[start];
                start++;

            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen ;
    }
}