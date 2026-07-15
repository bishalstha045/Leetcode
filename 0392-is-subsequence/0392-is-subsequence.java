class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
/*
Use two pointers to traverse both strings.
If characters match, move both pointers; otherwise, move only the pointer of t.
If all characters of s are matched in order, return true; otherwise, return false.
*/