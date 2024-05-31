class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>anslist=new ArrayList<>();
        anslist.add(1);
        long ans=1;
        for(int i=0;i<rowIndex;i++)
        {
            ans=ans*(rowIndex-i);
            ans=ans/(i+1);
            anslist.add((int)ans);
        }
        return anslist;
    }
}