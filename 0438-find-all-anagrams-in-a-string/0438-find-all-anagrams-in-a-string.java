class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();

        int[] patternArray = new int[26];
        int[] windowArray = new int[26];

        int left = 0 ;

        if(s.length() < p.length())
          return list;
    
        for (int i = 0; i < p.length(); i++) {
            patternArray[(p.charAt(i)-'a')]++;
        }
 
        for (int right = 0; right < s.length(); right++) {

            windowArray[(s.charAt(right)-'a')]++;

            if((right-left+1) > p.length()){
                 windowArray[(s.charAt(left)-'a')]--;
                 left++;
            }
           if((right-left+1) == p.length()){
                if(Arrays.equals(patternArray,windowArray))
                list.add(left);
            }
              
        }
        return list;
    }
}