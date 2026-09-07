class Solution {
    public void backtrack(int[] candidates, int index, int target, List<Integer> list, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList(list));
            return;
        }

        if (target < 0)
            return;

        for (int i = index; i < candidates.length; i++) {
            list.add(candidates[i]);
            backtrack(candidates, i, target - candidates[i], list, result);
            list.remove(list.size() - 1);
        }

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(candidates, 0, target, new ArrayList<>(), result);

        return result;
    }
}