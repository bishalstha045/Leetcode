class Solution {
    public int myAtoi(String s) {

        int i = 0, n = s.length();
        int sign = 1;
        long ans = 0;

        // skip leading spaces
        while(i < n && s.charAt(i) == ' ') {
            i++;
        }

        // check sign
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if(s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // convert digits
        while(i < n && Character.isDigit(s.charAt(i))) {

            ans = ans * 10 + (s.charAt(i) - '0');

            // handle overflow
            if(sign * ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if(sign * ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * ans);
    }
}
// String Parsing
// Skip spaces
// Check sign
// Convert digits to number
// Handle overflow
// Time: O(n)
// Space: O(1)