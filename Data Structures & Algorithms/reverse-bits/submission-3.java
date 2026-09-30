class Solution {
    public int reverseBits(int n) {
        
        int i,res=0;

        //cross directional:
        //for n we are moving from left to right via the last bit
        //for res we are shifting from right to left via the last bit

        for(i=0;i<32;++i){
            res = (res << 1) | (n & 1);
            n>>=1;
        }

        return res;
    }
}
