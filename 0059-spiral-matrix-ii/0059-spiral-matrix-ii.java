class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        int startrow=0;
        int startcol=0;
        int endrow=arr.length-1;
        int endcol=arr[0].length-1;
        int i=1;
        while(startrow<=endrow&&startcol<=endcol)
        {
            for(int j=startcol;j<=endcol;j++)
            {
                arr[startrow][j]=i;
                i++;
            }
            for(int k=startrow+1;k<=endrow;k++)
            {
                arr[k][endcol]=i;
                i++;
            }
            for(int l=endcol-1;l>=startcol;l--)
            {
                if(startrow==endrow)
                {
                    break;
                }
                arr[endrow][l]=i;
                i++;
            }
            for(int m=endrow-1;m>=startrow+1;m--)
            {
                if(startcol==endcol)
                {
                    break;
                }
                arr[m][startcol]=i;
                i++;
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        return arr;
    }
}