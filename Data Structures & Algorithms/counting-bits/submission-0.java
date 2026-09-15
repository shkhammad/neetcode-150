class Solution {
    public int[] countBits(int n) {
        int res[] = new int[n+1];
        int i,j;

        for(i=0;i<=n;++i){
            for(j=0;j<32;++j){
                if(((1<<j)&i) != 0)
                    ++res[i];
            }
        }

        return res;
    }
}
