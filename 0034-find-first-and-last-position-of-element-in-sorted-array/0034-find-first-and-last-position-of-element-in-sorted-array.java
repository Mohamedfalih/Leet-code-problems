class Solution {
    public int first(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1;
        int result = -1;

        while(low <= high){

            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                result =  mid;
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return result;
    }
    public int last(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1;
        int result = -1;

        while(low <= high){

            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                result = mid;
                low = mid + 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return result;
    }
    public int[] searchRange(int[] nums, int target) {
        
        int[] result = new int[2];

        result[0] = first(nums , target);
        result[1] = last(nums , target);

        return result;
    }
}