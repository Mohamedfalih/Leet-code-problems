class Solution {
    public boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length()-1;

        s = s.toLowerCase();
        while (l < r) {
            if (('a' <= s.charAt(l) && s.charAt(l) <= 'z')
                    || ('A' <= s.charAt(l) && s.charAt(l) <= 'Z')
                    || ('0' <= s.charAt(l) && s.charAt(l) <= '9')) {

                if (('a' <= s.charAt(r) && s.charAt(r) <= 'z')
                        || ('A' <= s.charAt(r) && s.charAt(r) <= 'Z')
                        || ('0' <= s.charAt(r) && s.charAt(r) <= '9')) {

                    
                    if (s.charAt(l) == s.charAt(r)) {
                        l++;
                        r--;
                        continue;
                    } else {
                        return false;
                    }
                }
                r--;
                continue;
            }
            l++;
        }

        return true;
    }
}