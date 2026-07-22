//O(n^2)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}

//O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0 ;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int find = target-nums[i];
            if(map.containsKey(find) && map.get(find) != i){
                return new int[]{i,map.get(find)};
            }
        }
        return new int[]{};
     }
}
