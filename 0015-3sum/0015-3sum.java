class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=  new ArrayList<>();
        Arrays.sort(nums);
        for(int fix=0;fix<nums.length-2;fix++){
            if(fix>0 && nums[fix]==nums[fix-1])continue;
            int left=fix+1;
            int right=nums.length-1;
            while(left<right){
            int sum=nums[fix]+nums[left]+nums[right];
            if(sum==0){
                List<Integer> el = new ArrayList<>();
                el.add(nums[fix]);
                el.add(nums[left]);
                el.add(nums[right]);
                ans.add(el);
                left++;
                right--;
                while(left<right && nums[left]==nums[left-1])left++;
                while(left<right && nums[right]==nums[right+1])right--;
            }
            else if(sum>0)right--;
            else left++;
        }
        }
        return ans;
    }
}

/*
    I first sorted the array so I could use the two-pointer technique. Then, I fixed one element and used two pointers to find the other two numbers whose sum equals zero. If the sum was too small, I moved the left pointer; if it was too large, I moved the right pointer. Whenever I found a valid triplet, I added it to the answer and skipped duplicate values to avoid repeated triplets. This approach efficiently finds all unique triplets in **O(n²)** time.


*/