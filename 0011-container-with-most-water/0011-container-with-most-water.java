class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while(left < right){
            int containerHeight = Math.min( height[left] , height[right] );
            int distance = right - left;
            int water = containerHeight * distance;

            maxWater = Math.max( maxWater , water );
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxWater;
    }
}