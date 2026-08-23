class Solution {
    public boolean sumGame(String num) {
        int leftsum = 0;
        int rightsum = 0;
        int qleft = 0;
        int qright = 0;
        int n = num.length();
        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?')
                qleft++;
            else
                leftsum += num.charAt(i) - '0';
        }
        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?')
                qright++;
            else
                rightsum += num.charAt(i) - '0';
        }
        int sumdiff = leftsum - rightsum;
        return (qleft + qright) % 2 == 1|| sumdiff != 9 * (qright - qleft) / 2;
    }
}
/*
Approach:
1. Divide the string into two halves.
2. Calculate the sum of fixed digits on both sides.
3. Count the number of '?' on the left and right.
4. Find:
      sumdiff = leftsum - rightsum
      qdiff   = qleft - qright
5. Each pair of '?' can create a maximum difference of 9,
   so the required difference is:
      9 * (qdiff / 2)
6. Bob wins only when:
      qdiff is even
      AND
      sumdiff == 9 * (qdiff / 2)
7. Since we need to check if Alice wins,
   return the opposite of Bob's condition.

Time Complexity: O(n)
Space Complexity: O(1)
*/