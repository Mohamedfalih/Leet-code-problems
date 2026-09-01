class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        HashMap<Integer , List<int[]>> adj = new HashMap<>();

        for(int i = 1 ; i <= n ; i++){
            adj.put(i , new ArrayList<>());
        }

        for(int[] edge : times){
            adj.get(edge[0]).add(new int[]{edge[1] , edge[2]});
        }

        int[] dist = new int[n+1];
        Arrays.fill(dist , Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{k,0});
        dist[k] = 0;

        while(!pq.isEmpty())
        {
            int[] curr = pq.poll();
            
            if(dist[curr[0]] < curr[1]) continue;

            for(int[] nei : adj.get(curr[0]))
            {
                if(nei[1] + curr[1] < dist[nei[0]])
                {
                    pq.offer(new int[]{nei[0] , nei[1]+curr[1]});
                    dist[nei[0]] = nei[1]+curr[1];
                }
            }
        }

        int ans = -1;
        for(int i = 1 ; i < n+1 ; i++){
            if(dist[i] == Integer.MAX_VALUE){
                return -1;
            }
            ans = Math.max(ans , dist[i]);
        }
        return ans;
    }
}