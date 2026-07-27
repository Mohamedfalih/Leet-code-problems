class Solution {
    public int countGoodSubstrings(String s) {

        int l = 0;
        int r = 2;
        int substr = 0;
        
        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() < 3) return 0;

        for (int i = 0; i < 3; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        if (map.size() == 3) {
            substr++;
        }

        while (r < s.length() - 1) {

            map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0) - 1);

            if (map.get(s.charAt(l)) == 0) {
                map.remove(s.charAt(l));
            }
            l++;
            
            r++;
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

            if (map.size() == 3) {
                substr++;
            }
        }

        return substr;
    }
}