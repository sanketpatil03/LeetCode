class Solution {
    public static int lastNeg(int nums[])
    {
        int start=0;
        int end=nums.length-1;
        int neg=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]<0)
            {
                start=mid+1;
                neg=mid;
            }
            else{
                end=mid-1;
            }
        }
        return neg;
    }
    public static int lastPositive(int nums[])
    {
        int start=0;
        int end=nums.length-1;
        int pos=nums.length;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]>0)
            {
                pos=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return pos;
    }
    public int maximumCount(int[] nums) {
       int negativeCount=lastNeg(nums)+1;
        int positiveCount=nums.length-lastPositive(nums);
        return Math.max(negativeCount,positiveCount);
    }
}