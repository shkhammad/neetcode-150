class Solution {
    public int singleNumber(int[] nums) {
        int i,res=0,n=nums.length;        
        if(n == 1) return nums[0];

        for(i=0;i<n;++i)
            res^=nums[i];
        
        return res;
    }
}
