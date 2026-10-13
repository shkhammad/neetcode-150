class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i,prd=1,n=nums.length;
        int res[] = new int[n];
        res[0] = 1;

        for(i=1;i<n;++i)
            res[i] = res[i-1]*nums[i-1];

        for(i=n-1;i>=0;--i){
            res[i]*=prd;
            prd*=nums[i];
        }

        return res;
    }
}  
