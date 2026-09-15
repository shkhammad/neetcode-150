class Solution {
    public int search(int[] nums, int target) {
        int beg=0,n=nums.length,end=n-1,mid;

        while(beg<=end){
            mid=beg+(end-beg)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid]< target)
                beg = mid + 1;
            else 
                end = mid - 1;
        }
        
        return -1;
    }
}
