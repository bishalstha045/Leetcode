class Solution {
    public String baseNeg2(int n) {
        if (n == 0) return "0";
        StringBuilder bin = new StringBuilder();
        while (n != 0) {
            int remainder = n % -2;
            n /= -2;
            if (remainder < 0) {
                remainder += 2;
                n += 1;
            }
            bin.append(remainder);
        }
        return bin.reverse().toString(); // here toString() converts stringbuilder to string
    }
}

// If n is 0, return "0"
// Store result digits
// Repeat until n becomes 0
// Find remainder with -2
// Divide n by -2
// Fix negative remainder
// make it positive and adjust n
// Add digit to result
// Reverse to get final answer