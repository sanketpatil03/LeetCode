class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        for(int i=0;i<nums1.length;i++)
        {
            int j=nums2.length-1;int greterindex=-1;
            while(j>=0&&nums2[j]!=nums1[i])
            {
                if(nums2[j]>nums1[i])
                {
                    greterindex=nums2[j];
                }
                j--;
            }
            nums1[i]=greterindex;
        }
        return nums1;
        
    }
   
}