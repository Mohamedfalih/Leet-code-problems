class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];
        int n = res.length;

        if(k > 0)
        {
            int s = 1;
            int e = k;
            int win = 0;
            for(int i = s ; i <= e ; i++){
                win += code[i];
            }
            res[0] = win;

            for(int i = 1 ; i < n ; i++)
            {
                win = win - code[s++ % n] + code[++e % n];
                res[i] = win;
            }
        }
        if(k < 0)
        {
            int s = n-1;
            int e = n + k;
            int win = 0;
            for(int i = s ; i >= e ; i--){
                win += code[i];
            }
            res[0] = win;

            for(int i = 1 ; i < n ; i++)
            {
                win = win + code[++s % n] - code[e++ % n];
                res[i] = win;
            }
        }

        return res;
    }
}