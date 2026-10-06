class Solution {
    public boolean isPalindrome(int x) {
      if(x<0 || (x%10==0 && x!=0))
      return false;
      int curr=x,rev=0;
      while(rev<curr){
        rev=(rev*10)+(curr%10);
        curr/=10;
      }
      return curr==rev || curr==rev/10;
    }
}