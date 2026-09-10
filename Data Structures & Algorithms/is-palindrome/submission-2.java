class Solution {
    public boolean isPalindrome(String s) {
        int i,n=s.length(),j;
        if(n == 1) return true;

        StringBuilder sb = new StringBuilder();

        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c))
                sb.append(Character.toLowerCase(c));
        }

        n = sb.length();
        i=0;
        j=n-1;
        
        if(n == 0 || n == 1)  return true;

        while(i<j){
            if(sb.charAt(i) != sb.charAt(j))
                return false;
            ++i;
            --j;
        }

        return true;
    }
}
