class Solution {
    public int[] plusOne(int[] digits) {
        int i,n=digits.length;
        
        for(i=n-1;i>=0;--i){
            if(digits[i] < 9){
                ++digits[i];
                return digits;
            }
    
            digits[i]=0;
        }

        int res[] = new int[n+1];
        ++res[0];
        
        return res;
    }
}
