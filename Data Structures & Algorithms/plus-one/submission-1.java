class Solution {
    public int[] plusOne(int[] digits) {
        long num=0;

        for(int val: digits){
            num*=10;
            num+=val;
        }

        List<Integer> ls = new ArrayList<>();
        ++num;

        while(num!=0){
            ls.addFirst((int)(num%10));
            num/=10;
        }

        int i,n=ls.size();
        int res[] = new int[n];

        for(i=0;i<n;++i)
            res[i] = ls.get(i);
        
        return res;
    }
}
