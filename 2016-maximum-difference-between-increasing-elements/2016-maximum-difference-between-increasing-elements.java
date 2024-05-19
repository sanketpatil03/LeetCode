class Solution {
    public int maximumDifference(int[] nums) {
        int minimum=nums[0];
        int diff=0;
        int maxDiff=-1;
        for(int i=0;i<nums.length;i++)
        {
            minimum=Math.min(minimum,nums[i]);
            if(minimum<nums[i])
            {
                maxDiff=Math.max(maxDiff,nums[i]-minimum);
            }
        }
        if(maxDiff>0)
        {
            return maxDiff;
        }
        return -1;
    }
}