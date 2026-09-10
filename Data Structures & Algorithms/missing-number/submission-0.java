class Solution {
    public int missingNumber(int[] nums) {
        int i,sum=0,n=nums.length;
        
        for(i=0;i<n;++i)
            sum+=nums[i];
        
        return ((n*(n+1))/2)-sum;
    }
}
