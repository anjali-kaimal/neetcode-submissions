class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,curr=x;
        while(curr>0){
            rev=(rev*10)+curr%10;
            curr/=10;
        }
        return x==rev;
    }
}