class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }
        int count = 0;
        for (int first = 1; first <= 9; first++) {
            if (freq[first] == 0) continue;
            freq[first]--;
            for (int second = 0; second <= 9; second++) {
                if (freq[second] == 0) continue;
                freq[second]--;
                // Last digit must be even
                for (int last = 0; last <= 8; last += 2) {
                    if (freq[last] > 0) {
                        count++;
                    }
                }
                freq[second]++;
            }
            freq[first]++;
        }
        return count;
    }
}
/*
Choose the first digit from 1-9 because leading zero is not allowed.
Temporarily remove that digit from the frequency.
Choose the second digit from 0-9.
Temporarily remove that digit too.
The last digit must be even, so we check 0, 2, 4, 6, 8.
If that digit is still available, we found one valid number.
Restore the frequencies and try the next possibility.
*/