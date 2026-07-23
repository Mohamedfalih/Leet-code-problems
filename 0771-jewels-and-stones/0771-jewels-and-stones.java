class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int sum=0;

        for(int i=0 ; i < stones.length() ; i++){

            String s = String.valueOf(stones.charAt(i));
            if(jewels.contains(s)){
                sum++;
            }
        }
        return sum;
    }
}