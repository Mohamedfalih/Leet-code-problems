class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer,Integer> mp = new HashMap<>();
        //for put to the map
        for(int i=0 ; i<nums.length ; i++){
            mp.put( nums[i] , mp.getOrDefault(nums[i],0)+1);
        }
        //finding frequencies
        int single=0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue() == 1){
                single = entry.getKey();
                break;
            }
        }
        return single;
    }
}