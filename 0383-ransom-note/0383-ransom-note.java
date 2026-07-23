class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        // HashMap<Character,Integer> ransomMap = new HashMap<>();

        // for(int i=0 ; i<ransomNote.length() ; i++){
        //     ransomMap.put(ransomNote.charAt(i) , ransomMap.getOrDefault(ransomNote.charAt(i),0)+1);
        // }

        HashMap<Character,Integer> magazineMap = new HashMap<>();

        for(int i=0 ; i<magazine.length() ; i++){
            magazineMap.put(magazine.charAt(i) , magazineMap.getOrDefault(magazine.charAt(i),0)+1);
        }

        for(int i=0 ; i<ransomNote.length() ; i++){

            magazineMap.put(ransomNote.charAt(i) , magazineMap.getOrDefault(ransomNote.charAt(i),0)-1);
            
            if(magazineMap.get(ransomNote.charAt(i)) < 0)
                return false;
        }
        // for(char key : magazineMap.keySet()){

        //     if(magazineMap.get(key) < 0)
        //         return false;
        // }
        return true;
    }
}