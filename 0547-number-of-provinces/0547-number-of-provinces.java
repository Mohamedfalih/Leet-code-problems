class Solution {

    static void dfs(int node , boolean[] visited , int[][] adj) {
		
		visited[node]  = true;
		
		for(int j = 0 ; j < adj.length ; j++) {
			if(!visited[j] && adj[node][j] == 1) {
				dfs(j , visited , adj);
			}
		}
		
	}
    public int findCircleNum(int[][] isConnected) {
    
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;

        for(int i = 0 ; i < isConnected.length ; i++){
            if(!visited[i]){
                count++;
                dfs(i , visited , isConnected);
            }
        }
        return count;
    }
}