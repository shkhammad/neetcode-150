class Solution {
    public boolean isAnagram(String s, String t) {
        int i;
        int mp1[] = new int[26];
        int mp2[] = new int[26];

        for(char c: s.toCharArray())
            ++mp1[(int)c-97];
        
        for(char c: t.toCharArray())
            ++mp2[(int)c-97];

        for(i=0;i<26;++i){
            if(mp1[i] != mp2[i])
                return false;
        }   

        return true;
    }
}
