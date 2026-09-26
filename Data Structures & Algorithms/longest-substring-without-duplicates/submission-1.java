class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i,j,n=s.length(),res=0;
        if(n == 1) return 1;
        
        Map<Character,Integer> mp = new HashMap<>();

        for(i=0;i<n;++i){
            for(j=i;j<n;++j){
                char c = s.charAt(j);
                // System.out.println(c);
                // System.out.println("i: " + i);
                // System.out.println("j: " + j);
                // System.out.println("Res: " + res);
                // System.out.println(mp);
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
            // if(j == n){
            //     //System.out.println(res);
            //     //res = Math.max(res,j-i+1);
            //     break;
            // }
        }

        return res;
    }
}
