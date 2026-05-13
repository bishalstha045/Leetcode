class Solution {
    public String convert(String s, int numRows) {
        
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        int dir = 1;

        for (char c : s.toCharArray()) {

            rows[row].append(c);

            if (row == 0) {
                dir = 1;
            } else if (row == numRows - 1) {
                dir = -1;
            }

            row += dir;
        }

        StringBuilder ans = new StringBuilder();

        for (StringBuilder r : rows) {
            ans.append(r);
        }

        return ans.toString();
    }
}

// Create rows for zigzag pattern
// Move downward and upward row by row
// Append characters to corresponding rows
// Join all rows to get final string

// TC: O(n)
// SC: O(n)