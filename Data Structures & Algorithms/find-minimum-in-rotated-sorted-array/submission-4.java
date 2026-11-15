class Solution {
    public int findMin(int[] nums) {
        int n=nums.length,l=-1,r=n,mid=-1;
        if(n == 1) return nums[0];

        while(r-l > 1){
            mid = l + (r-l)/2;

            //using invariant approach
            if(nums[mid] <= nums[n-1])
                r = mid;
            else
                l = mid;
        }

        //l will contain the index of the max element
        //r will contain the index of the min element

        return nums[r];
    }
}
