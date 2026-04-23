class Solution {
    public boolean containsDuplicate(int[] nums) {
        int[] frequency = frequencyArray(nums);

        for (int num : nums) {
            if (frequency[num] > 1) {
                return true;
            }
        }
        return false;
    }

    public int[] frequencyArray(int[] arr) {
        int[] freq = new int[100002];

        for (int el : arr) {
            freq[el]++;
        }

        return freq;
    }
}
