class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i,n=matrix.length,beg=0,end=n-1,mid=0,tmp,og;
        
        while(beg <= end){
            mid = beg+(end-beg)/2;
            tmp = matrix[mid][0];

            if(tmp == target)
                return true;
            else if(tmp < target)
                beg = mid + 1;
            else
                end = mid - 1;
        }

        if(end<0) return false;
        // System.out.println(matrix[end][0]);
        og=end;
        beg=0;end=matrix[og].length-1;mid=0;
        // System.out.println(beg);
        // System.out.println(end);
        // System.out.println(beg);

        while(beg <= end){
            mid = beg+(end-beg)/2;
            tmp = matrix[og][mid];

            if(tmp == target)
                return true;
            else if(tmp < target)
                beg = mid + 1;
            else
                end = mid - 1;
        }

        return false;
    }
}
