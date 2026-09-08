class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();

        for(char c: s.toCharArray()){
            if(c == '(' || c == '[' || c == '{')
                st.push(c);
            else if(c == ')' && !st.isEmpty() && st.peek() == '(')
                st.pop();
            else if(c == ']' && !st.isEmpty() && st.peek() == '[')
                st.pop();
            else if(c == '}' && !st.isEmpty() && st.peek() == '{')
                st.pop();
            else
                return false;
        }

        return st.isEmpty();
    }
}
