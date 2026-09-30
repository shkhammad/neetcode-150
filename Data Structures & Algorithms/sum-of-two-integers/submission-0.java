class Solution {
    public int getSum(int a, int b) {
        
        int i,res=0;
        boolean carry = false;

        for(i=0;i<32;++i){
            int abit = a&1;
            int bbit = b&1;

            if(abit == 1 && bbit == 1 && carry){
                res |=(1<<i);
                carry = true;
            }

            else if(abit == 1 & bbit == 1 && !carry){
                res &= ~(1<<i);
                carry = true;
            }

            else if(abit == 0 && bbit == 1 && carry){
                res &= ~(1<<i);
                carry = true;
            }

            else if(abit == 0 && bbit == 1 && !carry){
                res |=(1<<i);
                carry = false;
            }

            else if(abit == 1 && bbit == 0 && carry){
                res &= ~(1<<i);
                carry = true;
            }

            else if(abit == 1 && bbit == 0 && !carry){
                res |=(1<<i);
                carry = false;
            }

            else if(abit == 0 && bbit == 0 && carry){
                res |=(1<<i);
                carry = false;
            }

            else {
                res &= ~(1<<i);
                carry = false;
            }
            
            a>>=1;
            b>>=1;

        }

        return res;
    }
}
