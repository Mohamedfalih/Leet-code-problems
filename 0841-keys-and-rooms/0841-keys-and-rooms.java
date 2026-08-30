class Solution {
    static void dfs(int node , boolean[] visited , List<List<Integer>> rooms){

        visited[node] = true;
    
        for(int nei : rooms.get(node)){
            if(!visited[nei]){
                dfs(nei , visited , rooms);
            }
        }

    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        boolean[] visited = new boolean[rooms.size()];
        List<Integer> res = new ArrayList<>();

        dfs(0 , visited , rooms);

        for(int i = 0 ; i < visited.length ; i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
        
    }
}