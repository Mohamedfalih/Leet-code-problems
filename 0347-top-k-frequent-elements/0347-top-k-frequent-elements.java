class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer , Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (b[1] - a[1]));

        for(int i = 0 ; i < nums.length ; i++)
        {
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        
        for(int key : map.keySet())
        {
            pq.offer(new int[] {key , map.get(key)});
        }
        int[] res = new int[k];

        for(int i = 0 ; i < k ; i++)
        {
            int[] curr = pq.poll();
            res[i] = curr[0]; 
        }

        return res;
    }
}