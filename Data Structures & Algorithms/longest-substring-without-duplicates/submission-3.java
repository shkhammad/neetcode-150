class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i=0,j,n=s.length(),res=0;
        if(n == 1) return 1;
        
        Map<Character,Integer> mp = new HashMap<>();

        for(j=0;j<n;++j){
            char c = s.charAt(j);
            
            //update the left pointerh
            if(mp.containsKey(c))
                i = Math.max(i,mp.get(c)+1);
            
            mp.put(c,j);
            res = Math.max(res,j-i+1);    
        }

        return res;
    }
}
