class Solution {
    public boolean search(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = right+left / 2;

            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid] < nums[right]){
                left = mid+1;
            }else{
                right = mid-1;
            }

        }
        return false;
    }
}