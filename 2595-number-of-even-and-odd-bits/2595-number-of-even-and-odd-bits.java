class Solution {
    public int[] evenOddBit(int n) {
        int odd = 0;
        int even = 0;
        int i = 0;
        while (n != 0) {
            // Check if the current bit is 1
            if ((n & 1) == 1) {
                if (i % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            n >>= 1;  // Move to the next bit
            i++;      // Move to the next bit position
        }
        return new int[]{even, odd};
    }
}