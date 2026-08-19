class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        return atMost(nums , k) - atMost(nums , k-1);
    }

    static int atMost(int[] nums , int k){
        int count = 0;
        HashMap<Integer , Integer> map = new HashMap<>();

        int start = 0;

        for(int end = 0 ; end < nums.length ; end++){

            map.put(nums[end] , map.getOrDefault(nums[end] , 0) + 1);

            while(map.size() > k){
                map.put(nums[start] , map.get(nums[start]) - 1);

                if(map.get(nums[start]) == 0){
                    map.remove(nums[start]);
                }
                start++;
            }

            count += end - start + 1;
        }

        return count;
    }
}