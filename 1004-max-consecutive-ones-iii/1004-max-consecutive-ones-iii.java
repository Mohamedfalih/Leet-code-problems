class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int count = 0;
        int max = 0;
        int warning = 0;
        int left = 0;

        for(int right = 0 ; right < nums.length ; right++)
        {
            if(nums[right] == 0){
                warning++;
            }
            while(warning > k){
                if(nums[left] == 0)
                    warning--;
                left++;
            }
            max = Math.max(max , right-left+1);
        }
        return max;
    }
}