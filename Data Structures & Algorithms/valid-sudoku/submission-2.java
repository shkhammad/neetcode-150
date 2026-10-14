class Solution {
    public boolean isValidSudoku(char[][] board) {
        int i,j,k;
        Set<Character> st = new HashSet<>();
        
        //row check
        for(i=0;i<9;++i){
            for(j=0;j<9;++j){
                //System.out.println("i: "+i+", j: "+j);
                char c = board[i][j];
                if(st.contains(c)) return false;
                if(c!='.') st.add(c);
            }
            st.clear();
        }

        //col check
        for(i=0;i<9;++i){
            for(j=0;j<9;++j){
                //System.out.println("j: "+j+", i: "+i);
                char c = board[j][i];
                if(st.contains(c)) return false;
                if(c!='.') st.add(c);
            }
            st.clear();
        }

        for(i=0;i<9;++i){
            int row =(i/3)*3;
            int col =(i%3)*3;

            for(j=row;j<row+3;++j){
                for(k=col;k<col+3;++k){
                    char c = board[j][k];
                    if(st.contains(c)) return false;
                    if(c!='.') st.add(c);
                }
            }
            st.clear();
        }

        return true;
    }
}
