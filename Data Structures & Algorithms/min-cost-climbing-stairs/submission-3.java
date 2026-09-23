class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int i,n=cost.length,dp[] = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);

        for(i=0;i<n;++i){
            if(dp[i] == Integer.MAX_VALUE) dp[i]=0;
            
            if(i == 0 || i == 1)
                dp[i+1] = Math.min(dp[i+1],cost[i]);
            
            else
                dp[i+1] = Math.min(dp[i+1],dp[i]+cost[i]);
            

            if(i+2 < n+1){
                if(i == 0 || i == 1)
                    dp[i+2] = Math.min(dp[i+2],cost[i]);
                else
                    dp[i+2] = Math.min(dp[i+2],dp[i]+cost[i]);
            }
            
            //System.out.println(Arrays.toString(dp));
        }

        return dp[n];
    }
}
