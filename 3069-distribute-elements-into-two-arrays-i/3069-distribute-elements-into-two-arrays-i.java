class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1))arr1.add(nums[i]);
            else arr2.add(nums[i]);
        }
        int x=arr1.size()+arr2.size();
        int[]result=new int[x];
        int a=0;
        int b=0;
        int c=0;
        while(a<arr1.size()){
            result[c++]=arr1.get(a++);
        }
        while(b<arr2.size()){
            result[c++]=arr2.get(b++);
        }
        return result;
    }
}
// I used two ArrayLists to divide the elements into arr1 and arr2.
// I start by putting the first two elements into the two lists.
// For every next element, I compare the last elements of both lists
// and add the current element to the list having the larger last value.
// Finally, I create the result array and copy all elements of arr1
// followed by all elements of arr2.