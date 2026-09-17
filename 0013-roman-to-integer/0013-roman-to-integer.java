class Solution {
    static int value(char c){

        switch(c)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }

    }
    public int romanToInt(String s) {
        
        int res = 0;

        for(int i = 1 ; i < s.length() ; i++){

            int curr = value(s.charAt(i-1));
            int next = value(s.charAt(i));

            if(curr < next){
                res -= curr;
            }
            else{
                res += curr;
            }

        }

        return res + value(s.charAt(s.length() - 1));
    }
}