class Solution {
    public int leastInterval(char[] tasks, int n) {
        int i,mp[] = new int[26];
        if(n == 0) return tasks.length;

        for(char c: tasks)
            ++mp[c-'A'];

        Arrays.sort(mp);
        int mx = mp[25], gaps=n*(mx-1);

        for(i=24;i>=0;--i)
            gaps-=Math.min(mx-1,mp[i]);
        
        return tasks.length + Math.max(0,gaps);

    }
}