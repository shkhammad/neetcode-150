class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length,i=0,j=n-1,res=0;

        while(i<j){
            res = Math.max(res,Math.min(heights[i],heights[j])*(j-i));
            if(heights[i]<heights[j])
                ++i;
            else
                --j;
        }

        return res;
    }
}
