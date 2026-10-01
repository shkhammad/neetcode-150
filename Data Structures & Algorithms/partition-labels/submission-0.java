class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();

        int itr,n=s.length(),min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        Map<Character,Integer> mp = new HashMap<>();

        for(itr=0;itr<n;++itr)
            mp.put(s.charAt(itr),itr);

        for(itr=0;itr<n;++itr){
            char c = s.charAt(itr);
            min = Math.min(min,itr);
            max = Math.max(max,mp.get(c));

            if(max == itr){
                res.add(max-min+1);
                min = Integer.MAX_VALUE;
                max = itr;
            }
        }
        
        return res;
    }
}
