class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<>();

        for(int i=0 ; i < words.length ; i++){

            String word = words[i];
            String encode = "";

            for(int j=0 ; j < word.length() ; j++){
                
                encode += morseCode[word.charAt(j) - 97];

            }
            set.add(encode);
        }
        return set.size();
    }
}