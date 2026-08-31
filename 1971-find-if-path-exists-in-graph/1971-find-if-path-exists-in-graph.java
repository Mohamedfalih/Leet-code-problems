class Solution {

    public boolean dfs(int s , int d , boolean[] visited , HashMap<Integer , List<Integer>> adjList){
        
        if(s == d)
            return true;
        
        visited[s] = true;

        for(int nei : adjList.get(s)){
            if(!visited[nei]){
                if(dfs(nei , d , visited , adjList))
                    return true;
            }
        }
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        HashMap<Integer , List<Integer>> adjList = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            adjList.put(i , new ArrayList<>());
        }

        for(int i = 0 ; i < edges.length ; i++){

            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }

        boolean[] visited = new boolean[n];

        return dfs(source , destination , visited , adjList);
    }
}