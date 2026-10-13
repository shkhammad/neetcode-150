class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i,n=nums.length;

        int res[] = new int[n];
        int lhs[] = new int[n];
        int rhs[] = new int[n];

        lhs[0] = nums[0];
        rhs[n-1] = nums[n-1];
        
        for(i=1;i<n;++i)
            lhs[i] = lhs[i-1]*nums[i];
        
        for(i=n-2;i>=0;--i)
            rhs[i] = rhs[i+1]*nums[i];

        for(i=0;i<n;++i){
            if(i == 0) 
                res[i] = rhs[i+1];

            else if(i == n-1)
                res[i] = lhs[i-1];

            else
                res[i] = lhs[i-1] * rhs[i+1];
        }

        return res;
    }
}  
