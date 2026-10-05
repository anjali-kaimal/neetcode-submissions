class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum=nums.length*(nums.length+1)/2,currSum=0;
        for(int num:nums){
            currSum+=num;
        }
        return expectedSum-currSum;
    }
}
