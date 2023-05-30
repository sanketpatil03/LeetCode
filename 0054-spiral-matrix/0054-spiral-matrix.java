class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> list=new ArrayList<Integer>(); 
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        
        while(startrow<=endrow&&startcol<=endcol)
        {
            for(int j=startcol;j<=endcol;j++)
            {
                list.add(matrix[startrow][j]);
            }
            for(int k=startrow+1;k<=endrow;k++)
            {
                list.add(matrix[k][endcol]);
                
            }
            for(int l=endcol-1;l>=startcol;l--)
            {
                if(startrow==endrow)
                {
                    break;
                }
                list.add(matrix[endrow][l]);
                
            }
            for(int m=endrow-1;m>=startrow+1;m--)
            {
                if(startcol==endcol)
                {
                    break;
                }
                list.add(matrix[m][startcol]);
            
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        return list;
    }
}