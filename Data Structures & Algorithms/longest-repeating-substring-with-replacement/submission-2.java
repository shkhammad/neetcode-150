class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Pair> mp = new HashMap<>();
        int i = 0, j, n = s.length(), len = 0, res = 1;

        if (n == 1) return res;

        for (j = 0; j < n; ++j) {
            char c = s.charAt(i);
            char t = s.charAt(j);

            if (c == t) {
                ++len;
            } else {
                if (!mp.containsKey(c)) {
                    mp.put(c, new Pair(len, j - 1));
                }

                if (mp.containsKey(t)) {
                    Pair tmp = mp.get(t);
                    int ct = tmp.count;
                    int ind = tmp.index;
                    int sp = j - ind - 1;

                    if (sp <= k) {
                        res = Math.max(res, ct + k + 1);
                    }
                }

                i = j;
                len = 1;
            }
        }

        return Math.max(res,len);
    }
}

class Pair {
    public int count, index;

    public Pair(int count, int index) {
        this.count = count;
        this.index = index;
    }
}