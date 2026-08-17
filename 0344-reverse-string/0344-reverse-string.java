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