class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }
}

/*
Explanation:
- Traverse both strings from right to left.
- Add corresponding bits and carry.
- Store (sum % 2) as current binary digit.
- Update carry = sum / 2.
- Reverse final string because digits are added backwards.

Time Complexity: O(max(a.length(), b.length()))
Space Complexity: O(max(a.length(), b.length()))
*/