class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int j = 0 ;j < grid[0].length ; j++)
            {
                if(grid[i][j] == 2)
                    q.offer(new int[]{i , j});
                else if(grid[i][j] == 1)
                    fresh++;
                
            }
        }

        if(fresh == 0) return 0;

        int mins = -1;
        int[][] direction = { {1,0},{-1,0},{0,1},{0,-1} };

        while(!q.isEmpty())
        {
            int levelEle = q.size();

            while(levelEle-- > 0)
            {
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                for(int d = 0 ; d < 4 ; d++){
                    int nr = r + direction[d][0];
                    int nc = c + direction[d][1];

                    if(nr >= 0 && nr < grid.length 
                                 && nc >= 0 
                               && nc < grid[0].length
                               && grid[nr][nc] == 1)
                    {
                        grid[nr][nc] = 2;
                        fresh--;
                        q.offer(new int[]{nr , nc});
                    }
                }
                
            }
            mins++;
        }
        if(fresh > 0)  return -1;
        else return mins;
    }
}