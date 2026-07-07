class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int max=0;
        int ans=0;
        int target=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
               target=nums[i+1];
               map.put(nums[i+1],map.getOrDefault(nums[i+1],0)+1);
                if(map.get(target)>max){
                max=map.get(target);
                ans=target;
            }
            } 
        }
        return ans;
    }
}
// Traverse the array and whenever the current element is equal to the key,
// consider the next element as the target. Use a HashMap to count how many
// times each target appears immediately after the key, while updating the
// answer whenever a target's frequency becomes the highest.