class Solution {
    public boolean isValidSudoku(char[][] board) {
        int i,j,k;
        Set<Character> st = new HashSet<>();
        Pair pairs[] = new Pair[9];
        pairs[0] = new Pair(0,3,0,3);
        pairs[1] = new Pair(0,3,3,6);
        pairs[2] = new Pair(0,3,6,9);
        pairs[3] = new Pair(3,6,0,3);
        pairs[4] = new Pair(3,6,3,6);
        pairs[5] = new Pair(3,6,6,9);
        pairs[6] = new Pair(6,9,0,3);
        pairs[7] = new Pair(6,9,3,6);
        pairs[8] = new Pair(6,9,6,9);

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
            for(j=pairs[i].rmi;j<pairs[i].rmx;++j){
                for(k=pairs[i].cmi;k<pairs[i].cmx;++k){
                    char c = board[j][k];
                    if(st.contains(c)) return false;
                    if(c!='.') st.add(c);
                }
            }
            st.clear();
        }

        return true;
    }

    class Pair{
        int rmi,rmx,cmi,cmx;
        public Pair(int rmi, int rmx, int cmi, int cmx){
            this.rmi = rmi;
            this.rmx = rmx;
            this.cmi = cmi;
            this.cmx = cmx;
        }
    }
}
