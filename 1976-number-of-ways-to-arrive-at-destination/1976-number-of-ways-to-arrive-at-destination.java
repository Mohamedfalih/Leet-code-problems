class Solution {
    public int countPaths(int n, int[][] roads) {
        long MOD = 1000000007;
        HashMap<Integer , List<int[]>> adj = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            adj.put(i , new ArrayList<>());
        }
        for(int i = 0 ; i < roads.length ; i++){
            int u = roads[i][0];
            int v = roads[i][1];
            int w = roads[i][2];

            adj.get(u).add(new int[]{v , w});
            adj.get(v).add(new int[]{u , w});
        }

        PriorityQueue<long[]> pq = new PriorityQueue<>((a,b)-> Long.compare(a[1], b[1]));
        long[] dist = new long[n];
        Arrays.fill(dist , Long.MAX_VALUE);
        dist[0] = 0;

        long[] ways = new long[n];
        ways[0] = 1;

        pq.offer(new long[]{0,0});

        while(!pq.isEmpty())
        {
            long[] curr = pq.poll();
            int node = (int) curr[0];
            long cost = curr[1];

            if(cost > dist[node])
                continue;
            
            for(int[] nei : adj.get(node))
            {
                long newCost = cost + nei[1];
                if(newCost < dist[nei[0]]){
                    dist[nei[0]] = newCost;
                    ways[nei[0]] = ways[node];
                    pq.offer(new long[]{nei[0] , newCost});
                }
                else if(newCost == dist[nei[0]]){
                    ways[nei[0]] = (ways[nei[0]] + ways[node]) % MOD;
                }
            }
        }

        return (int) ways[n-1];

    }
}