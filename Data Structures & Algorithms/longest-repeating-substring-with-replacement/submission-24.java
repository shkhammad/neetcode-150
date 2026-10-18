class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,n=s.length(),j,max=0,res=0;
        Map<Character,Integer> mp = new HashMap<>();

        for(j=0;j<n;++j){
            //System.out.println("j: " + j);
            char c = s.charAt(j);
            //System.out.println("c: " + c);
            mp.put(c,mp.getOrDefault(c,0)+1);
            //System.out.println(mp.toString());
            max = Math.max(max,mp.get(c));
            
            if((j-i+1)-max > k){
                mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                ++i;
            }

            res=Math.max(res,j-i+1);

            //System.out.println("res: " + res);
        }

        return res;
    }
}
