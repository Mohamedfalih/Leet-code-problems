class Solution {
    public int countCharacters(String[] words, String chars) {
        
        HashMap<Character,Integer> charMap = new HashMap<>();

        for(int i = 0 ; i < chars.length() ; i++){
            charMap.put(chars.charAt(i) , charMap.getOrDefault(chars.charAt(i),0)+1);
        }

        int length = 0;

        for(int i = 0 ; i < words.length ; i++){

            String word = words[i];

            HashMap<Character,Integer> wordMap = new HashMap<>();

            boolean flag  = true;

            for(int j = 0 ; j < word.length() ; j++){
                if(charMap.containsKey(word.charAt(j)))
                    wordMap.put(word.charAt(j) , wordMap.getOrDefault(word.charAt(j),0)+1);
                else{
                    flag = false;
                    break;
                }
            }

            if(flag){

                boolean flag1  = true;

                for(int j=0 ; j < word.length() ; j++){
                    if(charMap.get(word.charAt(j)) < wordMap.get(word.charAt(j))){
                        flag1 = false;
                        break;
                    }
                }

                if(flag1){
                    length += word.length();
                }
            }
        }
        return length;
    }
}