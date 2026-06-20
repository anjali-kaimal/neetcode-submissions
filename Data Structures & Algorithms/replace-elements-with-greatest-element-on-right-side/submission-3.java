class Solution {
    public int[] replaceElements(int[] arr) {
        int maxRight=-1,temp=0;
        for(int i=arr.length-1;i>=0;i--){
            temp=arr[i];
            arr[i]=maxRight;
            maxRight=Math.max(temp,maxRight);
        }
        return arr;
    }
}