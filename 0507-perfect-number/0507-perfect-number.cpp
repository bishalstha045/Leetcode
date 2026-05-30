class Solution {
public:
    bool checkPerfectNumber(int num) {
        if (num <= 1) return false;

        int sum = 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
};
// A perfect number is equal to the sum of its positive divisors excluding itself.
// Start with 1 since it is a divisor of every number greater than 1.
// Check divisors only up to sqrt(num) and add both divisor pairs.
// Avoid double-counting when the divisor is the square root.
// Return true if the sum of proper divisors equals the number.