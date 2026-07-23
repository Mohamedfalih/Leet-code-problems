class Solution {
    public int compress(char[] chars) {

        String res = "";
        int count =1;
        char current = chars[0];

        for(int i=1 ; i < chars.length ; i++){
            if(current == chars[i])
                count++;
            else{
                res += current;
                if(count != 1)
                    res += count;
                
                current = chars[i];
                count = 1;
            }
        }

        res += current;
        if(count != 1)
            res += count;
        
        for(int i=0 ; i<res.length() ; i++){
            chars[i] = res.charAt(i);
        }
        return res.length();
    }
}