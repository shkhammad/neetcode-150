class Solution {
    public int reverseBits(int n) {
        int i,res=0;
        StringBuilder sb = new StringBuilder();
        
        for(i=0;i<32;++i){
            if((n&(1<<i)) != 0)
                sb.append('1');
            else
                sb.append('0');
        }

        sb.reverse();
        
        for(i=0;i<32;++i){
            if(sb.charAt(i) == '1')
                res |= (1<<i);
        }

        return res;

    }
}

//101
//101

//100
//011