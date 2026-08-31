class Solution {
    
    public int dfs(int row , int col , boolean[][] visit , int[][] grid){

        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length)
            return 0;

        if(grid[row][col] != 1)
            return 0;
        
        if(visit[row][col])
            return 0;

        visit[row][col] = true;
        int count = 1;
        

        count += dfs(row + 1 , col , visit , grid);
        count += dfs(row - 1 , col , visit , grid);
        count += dfs(row , col + 1 , visit , grid);
        count += dfs(row , col - 1 , visit , grid);

        return count;

    }
    public int maxAreaOfIsland(int[][] grid) {

        boolean[][] visit = new boolean[grid.length][grid[0].length];
        int maxArea = 0;

        for(int r = 0 ; r < grid.length ; r++){
            for(int c = 0 ; c < grid[0].length ; c++){

                int count = 0;
                if(!visit[r][c] && grid[r][c] == 1){

                    
                    maxArea = Math.max( maxArea , dfs(r , c , visit , grid) );
                    
                }
            }
        }
        return maxArea;
    }
}