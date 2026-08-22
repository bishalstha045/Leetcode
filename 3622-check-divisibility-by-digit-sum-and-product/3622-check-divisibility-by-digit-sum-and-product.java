class Solution {
    public boolean checkDivisibility(int n) {
        int dsum = 0;
        int dpro = 1;
        int x = n;
        while (x != 0) {
            int r = x % 10;
            dsum += r;
            dpro *= r;
            x /= 10;
        }
        return n %(dsum + dpro)==0;
    }
}
/*
i find out digits and store their sum and product after math i check if their sum is divisible by there number then return true else false
 */