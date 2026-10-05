class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedSum=n*(n+1)/2,currSum=0;
        for(int num:nums){
            currSum+=num;
        }
        return expectedSum-currSum;
    }
}
