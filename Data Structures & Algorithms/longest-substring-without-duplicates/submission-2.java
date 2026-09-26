class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i,j,n=s.length(),res=0;
        if(n == 1) return 1;
        
        Map<Character,Integer> mp = new HashMap<>();

        for(i=0;i<n;++i){
            for(j=i;j<n;++j){
                char c = s.charAt(j);
                if(!mp.containsKey(c)){
                    mp.put(c,j);
                    res = Math.max(res,j-i+1);
                }
                else{
                    i = mp.get(c);
                    mp.clear();
                    break;
                }
            }
        }

        return res;
    }
}
