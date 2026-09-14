class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int i,j,s1=0,s2=0,tmp=0,n=gas.length,res=-1;

        for(i=0;i<n;++i){
            s1+=gas[i];
            s2+=cost[i];
        }

        if(s1 < s2) return -1;

        for(i=0;i<n;++i){
            for(j=i;j<=n;++j){
                tmp+=gas[j%n]-cost[j%n];
                if(tmp < 0){
                    res = -1;
                    break;
                }
                res=i;
            }
            tmp=0;
            i=j;
        }

        return res;
    } 
}
