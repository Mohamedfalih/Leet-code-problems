class Solution {
    static void backtrack(int[] nums , List<Integer> list , List<List<Integer>> result){
        if(list.size() == nums.length)
            result.add(new ArrayList(list));
        else{

            for(int i = 0 ; i < nums.length ; i++){
                
                if(!list.contains(nums[i])){
                    list.add(nums[i]);
                    backtrack(nums , list , result);
                    list.remove(list.size() - 1);
                }
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums , new ArrayList<>() , result);

        return result;
    }
}