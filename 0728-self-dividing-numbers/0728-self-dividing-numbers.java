class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(div(i))ans.add(i);
        }
        return ans;
    }
    public boolean div(int n){
        int num=n;
        while(num!=0){
            int r=num%10;
            if(r==0)return false;
            else if(n%r!=0)return false;
            num/=10;
        }
        return true;
    }
}
/*
firstly, i checked findout the digits of each number and checked if each remainder(digit) of a number satisfies the condition (i.e if the digit is divisible by the number and is not a zero) then this number is a self dividing number
 */