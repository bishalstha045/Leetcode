class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set= new HashSet<>();
        while(n!=1){
            if(set.contains(n))return false;
            set.add(n);
            n=squaresum(n);
        }
        return true;
    }
    public int squaresum(int n){
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum+=r*r;
            n/=10;
        }
        return sum;
    }
}
// Use a HashSet to keep track of the numbers we've already visited.
// If we reach 1, the number is happy. If a number repeats, it means
// we've entered a cycle, so the number cannot become 1. In each step,
// calculate the sum of the squares of its digits and continue the process.