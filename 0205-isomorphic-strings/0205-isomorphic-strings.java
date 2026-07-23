class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character,Character> iso = new HashMap<>();

        for(int i=0 ; i < s.length() ; i++){
            if(!iso.containsValue(t.charAt(i)))
                iso.put(s.charAt(i) , t.charAt(i));
            else
                continue;
        }

        String dummy = "";

        for(int i=0 ; i < s.length() ; i++){
            dummy += iso.get(s.charAt(i));
        }

        return t.equals(dummy);

    }
}