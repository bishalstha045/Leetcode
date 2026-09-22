class Solution {
    public int smallestNumber(int n) {
        int num=n;
        while((num&(num+1))!=0){
            num++;
        }
        return num;
    }
}
/*
i used bit manipuation to extract numbers bit
if i get 0 when i perform bitwise & between n and n+1 then the number n is all set number
so until i find particular number is all set i keep on increasing number and eventually after finding out smallest all set number i simply return it
 */