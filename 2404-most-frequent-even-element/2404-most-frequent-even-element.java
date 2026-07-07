class Solution {
    public int mostFrequentEven(int[] nums) {
       int[]arr=new int[100001];
       for(int el:nums){
        if(el%2==0){
            arr[el]++;
        }
       } 
       int maxfreq=0;
       int ans=-1;
       for(int i=0;i<arr.length;i+=2){
        int freq=arr[i];
        if(freq>maxfreq){
            maxfreq=freq;
            ans=i;
        }
        else if(freq==maxfreq && maxfreq!=0 && i<ans)ans=i;
       }
       return ans;
    }
}
/*
Sort the array so that equal elements become consecutive. Traverse the sorted
array and count the frequency of each even number. Keep track of the highest
frequency seen so far and the corresponding even number. Since the array is
sorted, if two even numbers have the same frequency, the smaller one is
encountered first, so it naturally becomes the answer. If no even number
exists in the array, return -1.
*/




// class Solution {
//     public int mostFrequentEven(int[] nums) {
//         int n=nums.length;
//         HashMap<Integer,Integer> map= new HashMap<>();
//         for(int el:nums){
//             map.put(el,map.getOrDefault(el,0)+1);
//         }
//         int maxfreq=0;
//         int ans=-1;
//         for(int el:map.keySet()){
//             if(el%2!=0)continue;
//             int freq=map.get(el);
//             if(freq>maxfreq){
//                 maxfreq=freq;
//                 ans=el;
//             }
//             else if(freq==maxfreq && el<ans){
//                 ans=el;
//             }
//         }
//         return ans;
//     }
// }
// /*
// Use a HashMap to count the frequency of every number in the array. Then iterate through the map and consider only even numbers. Keep track of the highest frequency seen so far and the corresponding even number. If another even number has a higher frequency, update the answer. If two even numbers have the same frequency, keep the smaller one. If no even number exists, return -1.
// */