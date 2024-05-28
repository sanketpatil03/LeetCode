class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
       int row=0;
        int rows=grid.length;
        int column=grid[0].length-1;
        
        while(row<grid.length && column>=0)
        {
            if(grid[row][column]>=0)
            {
                row++;
            }
            else{
                column--;
                count+=rows-row;
            }
        }
        return count;
    }
}