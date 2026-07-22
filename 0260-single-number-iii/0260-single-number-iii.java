class Solution {
    public int[] singleNumber(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i=0 ; i<nums.length ; i++){
            map.put( nums[i] , map.getOrDefault(nums[i],0)+1);
        }
        int rs =0;
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            if(mp.getValue() == 1){
                result[rs++] = mp.getKey();
            }
        }

        return result;

    }
}