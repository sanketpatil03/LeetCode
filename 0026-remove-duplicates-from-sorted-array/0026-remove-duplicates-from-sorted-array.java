class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int j=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
        if(map.containsKey(nums[i]))
        {
            
            continue;
        }
            else{
                map.put(nums[i],i);
                k++;
                nums[j]=nums[i];
                j++;
            }
        }
        return k;
        
    }
}