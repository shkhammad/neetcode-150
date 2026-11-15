class Solution {
    public int findMin(int[] nums) {
        int n=nums.length,l=0,r=n-1,mid=-1;
        if(n == 1) return nums[0];

        while(l <= r){
            mid = l + (r-l)/2;

            if(nums[mid] < nums[n-1])
                r = mid - 1;
            else
                l = mid + 1;
        }

        return l < n ?nums[l] :nums[r];
    }
}
