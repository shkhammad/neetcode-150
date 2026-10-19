class Solution {
    public int maxProfit(int[] prices) {
        int i=0,j,tmp,n=prices.length,res=0;

        for(j=1;j<n;++j){
            tmp = prices[j]-prices[i];
            res = Math.max(tmp,res);
            if(tmp < 0) i=j;
        }

        return res;
    }
}
