class Solution {
    public int maximumDifference(int[] nums) {
        int n =nums.length;
        int diff=0;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(diff<nums[j]-nums[i]){
                    diff = nums[j]-nums[i];
                }
            }
        }
        if(diff==0)
            return -1;
        return diff;
    }
}