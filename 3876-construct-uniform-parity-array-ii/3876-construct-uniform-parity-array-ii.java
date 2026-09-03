class Solution {
    public boolean uniformArray(int[] nums) {
        int minOdd = Integer.MAX_VALUE;
        for (int x : nums) {
            if ((x & 1) == 1) {
                minOdd = Math.min(minOdd, x);
            }
        }
        // If there is no odd number, all numbers are already even.
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }
        for (int x : nums) {
            if ((x & 1) == 0 && minOdd >= x) {
                return false;
            }
        }
        return true;
    }
}
// Find the smallest odd number.
// We can keep odd numbers as they are.
// For an even number, subtracting a smaller odd number makes it odd.
// So if minOdd < x for every even x, we can make all numbers odd.