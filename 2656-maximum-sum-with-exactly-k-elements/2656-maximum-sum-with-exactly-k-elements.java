class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum=0;
        int max=0;
       for(int x:nums)
       {
           max=Math.max(max,x);
       }
        
        while(k!=0)
        {
           sum+=max;
            max++;
            k--;
        }
        return sum;
    }
}