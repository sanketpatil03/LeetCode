class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<mat.length;i++)
        {
            sum=sum+mat[i][i];
            int j=n-1-i;
            if(i!=j)
            {
                sum=sum+mat[i][j];
            }
        }
        return sum;
    }
}