class Solution {

    static void backtrack(int i , int[] nums , ArrayList<Integer> sub , List<List<Integer>> result , HashSet<List<Integer>> set){

        //base condition
        if(i == nums.length){
            if(!set.contains(sub)){
                result.add(new ArrayList<>(sub));
                set.add(new ArrayList<>(sub));
            }
            return;
        }

        //recursive call
        sub.add(nums[i]);
        backtrack(i+1 , nums , sub , result , set);

        sub.remove(sub.size() - 1);
        backtrack(i+1 , nums , sub , result , set);

    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        backtrack(0 , nums , new ArrayList<>() , result , set);

        return result;
    }
}