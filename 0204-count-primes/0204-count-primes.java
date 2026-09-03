class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        // In Java, boolean array defaults to false.
        // false = prime, true = not prime (composite)
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]){
                count++;
                // Cross off multiples of i starting from i * i
                for (long j = (long) i * i; j < n; j += i) {
                    notPrime[(int) j] = true;
                }
            }
        }
        return count;
    }
}