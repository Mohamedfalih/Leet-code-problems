class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);

        int maxScore = 0;
        int score = 0;

        int left =0;
        int right = tokens.length-1;

        while(left <= right){

            int max = tokens[right];

            if(power >= tokens[left]){
                power -= tokens[left];
                score++;
                left++;
            }
            else{
                score--;
                power += max;
                right--;
                if(score < 0 ){
                    return 0;
                }
            }
            
            maxScore = Math.max(maxScore , score);
            
        }

        return maxScore;
    }
}