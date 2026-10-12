class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> mp = new HashMap<>();

        for(String s: strs){
            char a[] = s.toCharArray();
            Arrays.sort(a);
            String t = new String(a);

            if(!mp.containsKey(t))
                mp.put(t, new ArrayList<>());
            
            mp.get(t).add(s);
        }

        for(String s: mp.keySet())
            res.add(mp.get(s));

        return res;
    }
}
