import java.util.Random;

class Solution {

    int[] nums;
    Random rand;

    public Solution(int[] nums) {
        this.nums = nums;
        rand = new Random();
    }

    public int pick(int target) {
        int result = -1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                count++;

                // Reservoir Sampling
                if (rand.nextInt(count) == 0) {
                    result = i;
                }
            }
        }

        return result;
    }
}
// Reservoir Sampling

// Traverse the array
// Whenever target is found:
// count increases

// rand.nextInt(count) generates:
// 0 to count-1

// If random value becomes 0,
// replace result with current index

// This ensures every valid index
// gets equal probability