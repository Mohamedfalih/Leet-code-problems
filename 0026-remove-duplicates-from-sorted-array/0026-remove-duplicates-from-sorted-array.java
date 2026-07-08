class Solution {
    public int removeDuplicates(int[] nums) {
        
        int size = nums.length;
        int i=0;
        for(int j=1;j<size;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}