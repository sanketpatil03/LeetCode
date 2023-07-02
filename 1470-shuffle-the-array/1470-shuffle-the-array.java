class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        int k=0;
        int j=0;
        int i=n;
        
       
        while(k<2*n)
        {
            ans[k++]=nums[j];
            ans[k++]=nums[i];
            i++;
            j++;
        }
        return ans;
    }
}