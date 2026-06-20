class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,countFinal=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count>countFinal)
                countFinal=count;
            }
            else
            {
                count=0;
            }
        }
        return countFinal;
    }
}