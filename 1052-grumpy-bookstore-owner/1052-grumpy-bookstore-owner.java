class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int satisfied = 0;
        for(int i = 0 ; i < customers.length ; i++){
            if(grumpy[i] == 0){
                satisfied += customers[i];
            }
        }
        int win = 0;
        for(int i = 0 ; i < minutes ; i++){
            if(grumpy[i] == 1)
                win += customers[i];
        }
        int maxi = win;

        int start = 0;
        int end = minutes-1;

        while(end < customers.length - 1){

            if(grumpy[start] == 1){
                win -= customers[start];
            }

            start++;
            end++;

            if(grumpy[end] == 1){
                win += customers[end];
            }

            maxi = Math.max(maxi , win);
        }
        return satisfied + maxi;
    }
}