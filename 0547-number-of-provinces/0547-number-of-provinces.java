class Solution {

    static void dfs(int node , boolean[] visited , HashMap<Integer , List<Integer>> adj) {
		
		visited[node]  = true;
		
		for(int nei : adj.get(node)) {
			
			if(!visited[nei]) {
				dfs(nei , visited , adj);
			}
		}
		
	}
    public int findCircleNum(int[][] isConnected) {
        
        HashMap<Integer , List<Integer>> adj = new HashMap<>();

        for(int i = 1 ; i <= isConnected.length ; i++){
            adj.put(i , new ArrayList<>());
        }

        int count = 0;

        for(int i = 0 ; i < isConnected.length ; i++){
            for(int j = 0 ; j < isConnected.length ; j++){

                if(isConnected[i][j] == 1 && i != j)
                    adj.get(i+1).add(j+1);
            }
        }

        boolean[] visited = new boolean[isConnected.length+1];

        for(int i = 1 ; i <= isConnected.length ; i++){
            if(!visited[i]){
                dfs(i , visited , adj);
                count++;
            }
        }
        return count;
    }
}