class Solution {
    public int romanToInt(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = value(s.charAt(i));

            // Check next character
            if (i < s.length() - 1 && current < value(s.charAt(i + 1))) {
                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }

    // Function to return Roman value
    public int value(char ch) {

        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;

        return 0;
    }
}

/*
Explanation:
- Convert each Roman character to integer.
- If current value is smaller than next value, subtract it.
  Example: IV = 5 - 1 = 4
- Otherwise add it.
- Finally return total sum.

Time Complexity: O(n)
Space Complexity: O(1)
*/