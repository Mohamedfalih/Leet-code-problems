class Solution {
    int perimeter = 0;
    public void dfs(int r , int c , boolean[][] visited , int[][] grid){

        if(visited[r][c])
            return;

        visited[r][c] = true;

        if(r-1 < 0 || grid[r-1][c] == 0)
            perimeter++;
        else
            dfs(r-1 , c , visited , grid);
        
        if(r+1 >= grid.length || grid[r+1][c] == 0)
            perimeter++;
        else
            dfs(r+1 , c , visited , grid);

        if(c-1 < 0 || grid[r][c-1] == 0)
            perimeter++;
        else
            dfs(r , c-1 , visited , grid);

        if(c+1 >= grid[0].length || grid[r][c+1] == 0)
            perimeter++;
        else
            dfs(r , c+1 , visited , grid);

    }

    public int islandPerimeter(int[][] grid) {

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        

        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){

                if(!visited[i][j] && grid[i][j] == 1){
                    dfs(i , j , visited , grid);
                }
            }
        }
        return perimeter;
    }
}