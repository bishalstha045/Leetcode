class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            num = digitSum(num);
        }
        return num;
    }
    public int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
/*
Approach:
Keep calculating the sum of digits until the number becomes a single digit.
Since each iteration reduces the number, it will eventually stop.
The final single-digit number is returned as the answer.
Time Complexity: O(log n)
Space Complexity: O(1)
*/