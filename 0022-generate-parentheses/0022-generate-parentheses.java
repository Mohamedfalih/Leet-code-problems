class Solution {

    static void backtrack(int left , int right , List<String> res , String s , int n){

        //base condition
        if(s.length() == n*2){
            res.add(s);
            return;
        }

        //recursive call
        if(left < n)
            backtrack(left+1 , right , res , s+"(" , n);
        if(right < left)
            backtrack(left , right+1 , res , s+")" , n);

    }
    public List<String> generateParenthesis(int n) {
        
        List<String> res = new ArrayList<>();

        backtrack(0 , 0 , res , "" , n);

        return res;

    }
}