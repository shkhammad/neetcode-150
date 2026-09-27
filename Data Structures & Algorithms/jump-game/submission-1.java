class Solution {
    public boolean canJump(int[] nums) {
        int i,tmp=0,n=nums.length;

        for(i=0;i<n;++i){
            if(tmp < i) return false;
            tmp = Math.max(tmp,i+nums[i]);
            if(n-1 <= tmp) break;
        }
        
        return true;
    }
}
