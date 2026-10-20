class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int mp1[] = new int[26];
        int mp2[] = new int[26];
        int i=0,j,k,n=s1.length(),ct=0,m=s2.length();

        for(j=0;j<n;++j)
            ++mp1[s1.charAt(j)-'a'];

        for(j=0;j<m;++j){
            ++mp2[s2.charAt(j)-'a'];

            if(j>n-2){
                for(k=0;k<26;++k){
                    if(mp1[k] == mp2[k])
                        ++ct;
                }
                
                if(ct == 26)
                    return true;
                
                --mp2[s2.charAt(i)-'a'];
                ++i;
                ct=0;
            }
        }
        
        return false;
    }
}
