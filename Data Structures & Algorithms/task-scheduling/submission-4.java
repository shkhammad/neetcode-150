class Solution {
    public int leastInterval(char[] tasks, int n) {
        int mp[] = new int[26];
        for(char c: tasks)
            ++mp[c-'A'];

        int mx = Arrays.stream(mp).max().getAsInt();
        int count = (int)Arrays.stream(mp).filter(x -> x == mx).count();

        return Math.max(tasks.length, (mx - 1)*(n + 1) + count);
    }
}