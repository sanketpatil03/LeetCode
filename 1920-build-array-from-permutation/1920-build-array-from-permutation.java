class Solution {
    public int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int j=nums[i];
            ans[i]=nums[j];
        }
        return ans;
    
    }
}