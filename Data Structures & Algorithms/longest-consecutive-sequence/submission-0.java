class Solution {
    public int longestConsecutive(int[] nums) {

        int i,tmp,n=nums.length,ct=0,res=0;

        Set<Integer> st = new HashSet<>();

        for(int val: nums)
            st.add(val);

        for(i=0;i<n;++i){
            if(st.contains(nums[i]-1))
                continue;

            else{
                tmp = nums[i];
                while(st.contains(tmp)){
                    ++tmp;
                    ++ct;
                }

                res = Math.max(res,ct);
                ct=0;
            }
        }
        
        return res;
    }
}
