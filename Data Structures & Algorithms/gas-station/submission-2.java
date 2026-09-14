class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int i,j,s1=0,s2=0,tmp,n=gas.length,res=-1;

        for(i=0;i<n;++i){
            s1+=gas[i];
            s2+=cost[i];
        }

        if(s1 < s2) return -1;

        for(i=0;i<n;++i){
            tmp = gas[i] - cost[i];
            if(tmp < 0) continue;
            j=(i+1)%n;

            //System.out.println(j);
            //System.out.println(tmp);

            while(true){
                //System.out.println();
                //System.out.println(tmp + gas[j] - cost[j]);
                tmp +=gas[j]-cost[j];
                if(tmp < 0){
                    res=-1;
                    break;
                }

                res = i;
                if(j==0) break;
                j = (j+1)%n;
            }

            if(j==0) break;
            i=j-1;
        }

        return res;
    } 
}
