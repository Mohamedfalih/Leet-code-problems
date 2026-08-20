class Solution {
    static boolean isPalindrome(int left, int right, String p) {
        while (left < right) {
            if (p.charAt(left) != p.charAt(right))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int maxLen = 0;
        String res = "";

        while (start < s.length()) {
            if (isPalindrome(start, end, s)) {
                if (maxLen < end - start + 1) {
                    maxLen = end - start + 1;
                    res = s.substring(start, end + 1);
                }
            }
            if (end == s.length() - 1) {
                start++;
                end = start;
            } else
                end++;

        }
        return res;
    }
}