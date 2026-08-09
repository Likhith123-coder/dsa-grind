class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxlen = 1;
        int start = 0;

        
        for (int i = 0; i < n; i++) {
            int len = 1 + length(i - 1, i + 1, s);
            if (len > maxlen) {
                maxlen = len;
                start = i - len / 2;
            }
        }

        
        for (int i = 1; i < n; i++) {
            int len = length(i - 1, i, s);
            if (len > maxlen) {
                maxlen = len;
                start = i - len / 2;
            }
        }

        return s.substring(start, start + maxlen);
    }

    public int length(int left, int right, String s) {
        int len = 0;
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                len += 2;
                left--;
                right++;
            } else {
                break;
            }
        }
        return len;
    }
}