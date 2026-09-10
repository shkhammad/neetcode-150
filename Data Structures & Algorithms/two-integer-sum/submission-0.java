class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,tmp,n=nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        int res[] = new int[2];

        for(i=0;i<n;++i){
            tmp = target-nums[i];

            if(mp.containsKey(tmp)){
                res[0] = mp.get(tmp);
                res[1] = i;
                break;
            }
            
            mp.put(nums[i],i);
        }

        return res;
    }
}
