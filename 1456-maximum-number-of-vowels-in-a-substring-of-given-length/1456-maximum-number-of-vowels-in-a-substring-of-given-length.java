class Solution {
    public int maxVowels(String s, int k) {
        
        
        int count = 0;

        for(int i = 0 ; i < k ; i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }
        int maxCount = count;

        int start = 0;
        int end = k-1;

        while(end < s.length()-1){

            char st = s.charAt(start);
            if(st == 'a' || st == 'e' || st == 'i' || st == 'o' || st == 'u')
                count--;
            
            start++;
            end++;
            char en = s.charAt(end);
            if(en == 'a' || en == 'e' || en == 'i' || en == 'o' || en == 'u')
                count++;
            
            
            maxCount = Math.max(maxCount , count);
        }

        return maxCount;


    }
}