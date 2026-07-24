class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int[] res = new int[nums.length];
        int r=0;

        int i=0;
        while(i < nums.length){
            if(nums[i]%2 == 0){
                res[r] = nums[i];
                r++;
            }
            i++;
        }
        int j=0;
        while(j < nums.length){
            if(nums[j]%2 == 1){
                res[r] = nums[j];
                r++;
            }
            j++;
        }


        return res;
    }
}