class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int var = 0 ;
        for(String s : operations)
        {
            var += (44 - s.charAt(1));
        }
        return var;
    }
}