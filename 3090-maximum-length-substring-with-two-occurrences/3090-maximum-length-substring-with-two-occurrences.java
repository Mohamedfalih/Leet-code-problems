class Solution {
    public int maximumLengthSubstring(String s) {
        
        int st = 0;
        int e = 0;
        int maxLen = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        while(e < s.length()){
            
            map.put(s.charAt(e) , map.getOrDefault(s.charAt(e) , 0) + 1);

            for(char c : map.keySet()){
                if(map.get(c) > 2){
                    map.put(s.charAt(st) , map.getOrDefault(s.charAt(st) , 0) - 1);
                    st++;
                }
            }
            
            maxLen = Math.max(maxLen , e-st+1);
            e++;
        }
        return maxLen;
    }
}