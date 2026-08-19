class Solution {

    static boolean isPalindrome(String s , int left , int right){

        while(left < right){
            if(s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    static void backtrack(String s , int start , List<String> valid , List<List<String>> result){

        //base condition
        if(start == s.length()){
            result.add(new ArrayList<>(valid));
            return;
        }

        //recursive call
        for(int end = start+1 ; end <= s.length() ; end++){

            if(isPalindrome(s , start , end -1)){

                valid.add(s.substring(start , end));

                backtrack(s , end , valid , result);

                valid.remove(valid.size()-1);
            }
        }
    }


    public List<List<String>> partition(String s) {
        
        List<List<String>> result = new ArrayList<>();

        backtrack(s , 0 , new ArrayList<>() , result);

        return result;
    }
}