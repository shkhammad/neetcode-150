class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int i,og=k,n=nums.length;
        
        List<Integer> tmp = new ArrayList<>();
        List<List<Integer>> buckets = new ArrayList<>();
        Map<Integer,Integer> mp = new HashMap<>();

        for(i=0;i<n+1;++i)
            buckets.add(new ArrayList<>());

        for(int val: nums)
            mp.put(val, mp.getOrDefault(val,0)+1);
        
        for(int val: mp.keySet()){ 
            buckets.get(mp.get(val)).add(val);
        }
        
        

        for(i=n;i>=0;--i){
            List<Integer> l = buckets.get(i);
            tmp.addAll(l);
            og-=l.size();

            if(og == 0) break;
        }

        //System.out.println(tmp.size());
        //System.out.println(tmp.get(0));

        int res[] = new int[k];

        for(i=0;i<k;++i)
            res[i] = tmp.get(i);

        return res;
    }
}
