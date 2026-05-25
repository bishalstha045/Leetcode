class Solution {
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }

        return result;
    }
}
// Take last bit from n and add it to result
// Shift result left to make space
// Repeat for all 32 bits