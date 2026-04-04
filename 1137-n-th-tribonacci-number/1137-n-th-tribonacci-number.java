// class Solution {
//     public int tribonacci(int n) {
// //         if(n==0||n==1){
// //             return n;
// //         }
// //         if(n==2){
// //             return 1;
// //         }
// //         return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
//     }
// }
//this solution is taking 530ms

class Solution {
   public int tribonacci(int n) {
    if(n==0){
        return 0;
    }
    if(n==1||n==2){
        return 1;
    }
    int a=0,b=1,c=1;
    for(int i=0;i<n;i++){
        int d=a+b+c;
        a=b;
        b=c;
        c=d;
    }
    return a;
   }
}