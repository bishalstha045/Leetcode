class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> ans= new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%5==0 && i%3==0) ans.add("FizzBuzz");
           else if(i%3==0) ans.add("Fizz");
            else if(i%5==0) ans.add("Buzz");
            else ans.add(String.valueOf(i)); // other wise we can write ans.add(i+"") --> making it string by concatenating number with integer
        }
        return ans;
    }
}