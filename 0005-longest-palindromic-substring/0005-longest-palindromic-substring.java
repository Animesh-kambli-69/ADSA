class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        String longest = "";
        for (int j = 0; j < s.length(); j++) {
            for (int i = s.length() - 1; i >= j; i--) {

                if ((i - j + 1) <= longest.length()) {
                    break;
                }
                if (isPalindrome(s, j, i)) {
                    longest = s.substring(j, i + 1);
                }
            }
        }        
        return longest;
    }

    private boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }
}
