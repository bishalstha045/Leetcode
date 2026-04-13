class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int left =0;
        int right =n-1;
        while(left<right){
            int sum=numbers[left]+ numbers[right];
            if(sum==target){
                return new int[]{left +1 , right +1};
            }
            else if(sum<target){
                left++;
            }
            else{
                right --;
            }
        }
       
        return new int[]{-1,-1};
    }
}

// if we had used brutforce then it would take O(n2) but this two pointer technique has a time complexity of O(n)
// here we used two pointer left and right and started loop until left is smaller than right we did this like in binary search we use to do whenever target equals to mid then we gonna return that only but if target is higher then left pointer increments else right pointer increments