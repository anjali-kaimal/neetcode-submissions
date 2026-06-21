class Solution {
    public int maxArea(int[] heights) {
        int high=0;
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights.length;j++){
                int val=(heights[i]>heights[j]?heights[j]:heights[i])*(i-j);
                if(val<0) val*=-1;
                if(val>high) high=val;
            }
        }
        return high;
    }
}
