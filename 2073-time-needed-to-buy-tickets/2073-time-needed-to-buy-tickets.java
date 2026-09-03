class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int n = tickets.length;
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.offer(i);
        }

        int time = 0;
        while(!q.isEmpty())
        {
            int x = q.poll();

            tickets[x]--;
            time++;

            if(x == k && tickets[x] == 0)
            {
                break;
            }
            if(tickets[x] > 0)
            {
                q.offer(x);
            }
        }
        
        return time;
    }
}