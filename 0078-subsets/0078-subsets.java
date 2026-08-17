class Solution {

    static void recur(int i , int[] nums , ArrayList<Integer> sub , List<List<Integer>> result ){

        //base condition
        if(i == nums.length){
            result.add(new ArrayList(sub));
            return;
        }

        //recursive call
        sub.add(nums[i]);
        recur(i+1 , nums , sub , result);
        sub.remove(sub.size() - 1);

        recur(i+1 , nums , sub , result);

    }
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();

        recur( 0 , nums , new ArrayList<Integer>() , result );

        return result;

    }
}