class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];

        if (k == 0) return ans;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
            } else {
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n];
                }
            }

            ans[i] = sum;
        }

        return ans;
    }
}

/*
Explanation:
- If k > 0:
  Sum next k elements.

- If k < 0:
  Sum previous |k| elements.

- If k == 0:
  Return array of zeros.

Modulo (%) is used for circular traversal.
*/