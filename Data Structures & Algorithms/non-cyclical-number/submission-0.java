class Solution {
    public boolean isHappy(int n) {
        int res=0,rem;
        Set<Integer> st = new HashSet<>();

        while(true){
            while(n!=0){
                rem=n%10;
                res +=rem*rem;
                n/=10;
            }

            if(res == 1) return true;
            if(st.contains(res)) break;
            
            st.add(res);
            n = res;
            res = 0;
        }

        return false;
    }
}
