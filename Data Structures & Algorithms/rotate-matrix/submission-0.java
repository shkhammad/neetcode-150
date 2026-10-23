class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length,tmp,i,j=0,k=n-1;

        for(i=0;i<n;++i){
            while(j<k){
                tmp = matrix[j][i];
                matrix[j][i] = matrix[k][i];
                matrix[k][i] = tmp;
                ++j;
                --k;
            }
            j=0;
            k=n-1;
        }

        for(i=0;i<n;++i){
            for(j=0;j<n;++j){
                if(j > i){
                    tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;
                }
            }
        }
    }
}
