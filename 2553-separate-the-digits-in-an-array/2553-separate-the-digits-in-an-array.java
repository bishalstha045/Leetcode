class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int num : nums) {
            String s = String.valueOf(num);

            for(char ch : s.toCharArray()) {
                list.add(ch - '0');
            }
        }

        int[] ans = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
// convert each number into string
// extract every character digit
// convert char to integer using ch - '0'
// store all digits in list in same order
// convert list into int[] and return