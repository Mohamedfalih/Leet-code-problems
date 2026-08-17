//RECURSION

class Solution {

    static void f(int left , int right , char[] s)
    {

        if(left >= right)
            return;

        char t = s[left];
        s[left] = s[right];
        s[right] = t;

        f(left + 1 , right - 1 , s);
    }

    public void reverseString(char[] s) {
        f(0 , s.length - 1 , s);
    }
}

//TWO POINTERS

class Solution {
    public void reverseString(char[] s)
    {
        int r = s.length-1;
        int f = 0;
        while(f<r)
        {
            char t = s[f];
            s[f] = s[r];
            s[r] = t;

            f++;
            r--;
        }
    }
}
