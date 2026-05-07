class Solution {
    public boolean lemonadeChange(int[] bills) {

        int five = 0, ten = 0;

        for (int bill : bills) {

            if (bill == 5) {
                five++;
            }

            else if (bill == 10) {
                if (five == 0) return false;

                five--;
                ten++;
            }

            else {

                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                }

                else if (five >= 3) {
                    five -= 3;
                }

                else {
                    return false;
                }
            }
        }

        return true;
    }
}

/*
Approach:
Store count of $5 and $10 bills.
Give correct change for each customer.
For $20, prefer giving $10 + $5.

Time Complexity: O(n)
Space Complexity: O(1)
*/