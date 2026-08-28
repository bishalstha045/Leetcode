class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int one=0;
        int zero=0;
        for(int s:students){
            if(s==0)zero++;
            else one++;
        }
        for(int sn:sandwiches){
            if(sn==0){
                if(zero==0)return one;
                zero--;
            }
            else{
                if(one==0) return zero;
                one--;
            }
        }
        return 0;
    }
}
/*

I first count how many students want `0` and `1`. Then I process each sandwich in order. If a sandwich type has no student left who wants it, the remaining students cannot eat, so I return the count of the other type. Otherwise, I decrease the count of that sandwich type.


 */