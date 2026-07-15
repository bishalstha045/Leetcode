class Solution {
    public boolean isSubsequence(String s, String t) {
        int start=0;
        for(int i=0;i<s.length();i++){
            int flag=0;
            for(int j=start;j<t.length();j++){
                if(t.charAt(j)==s.charAt(i)){
                    flag=1;
                    start=j+1;
                    break;
                }
            }
            if(flag==0)return false;
        }
        return true;
    }
}
/*
Approach:
For each character in s, search for its first matching character in t starting from the last matched position.
If a match is found, update the starting index for the next search.
If any character cannot be matched, return false.
If all characters are matched in order, return true.
*/
//time(O(m*n) space=O(1))

// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         int i = 0, j = 0;
//         while (i < s.length() && j < t.length()) {
//             if (s.charAt(i) == t.charAt(j)) {
//                 i++;
//             }
//             j++;
//         }
//         return i == s.length();
//     }
// }
/*
Use two pointers to traverse both strings.
If characters match, move both pointers; otherwise, move only the pointer of t.
If all characters of s are matched in order, return true; otherwise, return false.
*/
//time(O(n) space=O(1))
