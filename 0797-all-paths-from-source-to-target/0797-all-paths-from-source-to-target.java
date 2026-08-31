class Solution {
    public void dfs(int src , int[][] graph , List<Integer> list , List<List<Integer>> res){

        if(src == graph.length - 1){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int nei : graph[src]){
            list.add(nei);
            dfs(nei , graph , list , res);
            list.remove(list.size()-1);
        }

    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        list.add(0);
        
        dfs(0 , graph , list , res);

        return res;

    }
}