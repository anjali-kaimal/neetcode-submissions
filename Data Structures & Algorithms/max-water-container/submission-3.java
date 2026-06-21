class Solution {
    public int maxArea(int[] heights) {
     int pointer1=0, pointer2=heights.length-1, height=0, width=0, maxArea=0;
     while(pointer1<pointer2){
        width=pointer2-pointer1;
        if(heights[pointer1]>heights[pointer2]){
            height=heights[pointer2];
            pointer2--;
        }
        else{
            height=heights[pointer1];
            pointer1++;
        }
        maxArea= Math.max(height*width,maxArea);

     }
     return maxArea;
    }
}
