class Solution {
    public boolean isPalindrome(String s) {
        int i,n=s.length(),j,v;
        if(n == 1) return true;

        StringBuilder sb = new StringBuilder();

        for(char c:s.toCharArray()){
            v = (int)c;
            if((v>96 && v<123) || (v>64 && v<91) || (v>47 && v<58))
                sb.append(Character.toLowerCase(c));
        }

        n = sb.length();
        i=0;
        j=n-1;
        
        //System.out.println(sb);

        if(n == 0 || n == 1)  return true;

        while(i<j){
            //System.out.println(s.charAt(i));
            //System.out.println(s.charAt(j));
            if(sb.charAt(i) != sb.charAt(j))
                return false;

            ++i;
            --j;

            //System.out.println(i);
            //System.out.println(j);
        }

        return true;
    }
}
