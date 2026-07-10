class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
}
/*
Approach:
This solution uses the Digital Root property. Repeatedly adding the digits of a
number always produces a repeating pattern from 1 to 9. Using this mathematical
property, the final single-digit result can be calculated directly without
iterating through the digits. The only special case is when the input is 0,
whose digital root is also 0.
Time Complexity: O(1)
Space Complexity: O(1)
*/



// class Solution {
//     public int addDigits(int num) {
//         while (num >= 10) {
//             num = digitSum(num);
//         }
//         return num;
//     }
//     public int digitSum(int n) {
//         int sum = 0;
//         while (n != 0) {
//             sum += n % 10;
//             n /= 10;
//         }
//         return sum;
//     }
// }
/*
Approach:
Keep calculating the sum of digits until the number becomes a single digit.
Since each iteration reduces the number, it will eventually stop.
The final single-digit number is returned as the answer.
Time Complexity: O(log n)
Space Complexity: O(1)
*/