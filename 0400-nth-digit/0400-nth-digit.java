class Solution {
    public int findNthDigit(int n) {
        long digitLength = 1;
        long count = 9;
        long start = 1;

        // Find the range where nth digit exists
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }

        // Find the actual number
        start += (n - 1) / digitLength;

        // Convert number to string and get digit
        String num = Long.toString(start);

        return num.charAt((int)((n - 1) % digitLength)) - '0';
    }
}