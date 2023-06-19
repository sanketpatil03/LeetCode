class Solution {
    public int maxProduct(int[] nums) {
        int maxproduct=Integer.MIN_VALUE;
        int n=nums.length;
        int prefix=1;
        int suffix=1;
        for(int i=0;i<nums.length;i++)
        {
          prefix=prefix*nums[i];
            suffix=suffix*nums[n-1-i];
           
            int product=Math.max(prefix,suffix);
            maxproduct=Math.max(maxproduct,product);
             if(prefix==0)
            {
                prefix=1;
            }
            if(suffix==0)
            {
                suffix=1;
            }
      }
        return maxproduct;
    }
}