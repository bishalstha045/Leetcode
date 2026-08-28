class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer>ans=new ArrayDeque<>();
        for(int s:students){
            ans.offer(s);
        }
        int i=0;
        int count=0;
        while(!ans.isEmpty() && count<ans.size()){
            if(ans.peek()==sandwiches[i]){
                ans.poll();
                i++;
                count=0;
            }
            else{
                ans.offer(ans.poll());
                count++;
            }
        }
        return ans.size();
    }
}
/*
I put all students into a queue. If the student at the front wants the current sandwich, they take it and leave the queue. Otherwise, I move that student to the back. If everyone gets skipped once, it means nobody wants the current sandwich, so the remaining students cannot eat.
*/


// class Solution {
//     public int countStudents(int[] students, int[] sandwiches) {
//         int one=0;
//         int zero=0;
//         for(int s:students){
//             if(s==0)zero++;
//             else one++;
//         }
//         for(int sn:sandwiches){
//             if(sn==0){
//                 if(zero==0)return one;
//                 zero--;
//             }
//             else{
//                 if(one==0) return zero;
//                 one--;
//             }
//         }
//         return 0;
//     }
// }
/*

I first count how many students want `0` and `1`. Then I process each sandwich in order. If a sandwich type has no student left who wants it, the remaining students cannot eat, so I return the count of the other type. Otherwise, I decrease the count of that sandwich type.


 */