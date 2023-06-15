class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n=grid.length;
        for(int i=0;i<grid.length;i++)
        {
            if(grid[i][i]==0||grid[i][n-1-i]==0)
            {
                return false;
            }
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                if(i==j||j==n-1-i)
                {
                    continue;
                }
                else if(grid[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
}