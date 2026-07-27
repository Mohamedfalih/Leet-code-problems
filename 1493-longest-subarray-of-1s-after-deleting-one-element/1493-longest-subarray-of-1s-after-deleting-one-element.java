class Solution {
    public int longestSubarray(int[] nums) {
        
        int l = 0;
        int r = 0;
        int zeros = 0;
        int maxLen = 0;

        while(r < nums.length){
            
            if(nums[r] == 0){
                zeros++;
            }
            while(zeros > 1){
                
                if(nums[l] == 0){
                    zeros--;
                }
                l++;
            }
           
            maxLen = Math.max(maxLen , (r-l+1));
            r++;
        }
        return maxLen-1;
    }
}