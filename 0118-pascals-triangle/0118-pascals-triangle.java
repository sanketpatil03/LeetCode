class Solution {
    public static List<Integer> pascalsTriangle(int row)
    {
        List<Integer> genRow=new ArrayList<>();
        genRow.add(1);
        int ans=1;
        for(int i=1;i<row;i++)
        {
            ans=ans*(row-i);
            ans=ans/i;
            genRow.add(ans);
        }
        return genRow;    
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        for(int i=1;i<=numRows;i++)
        {
             ans.add(pascalsTriangle(i));
        }
       return ans;
    }
}