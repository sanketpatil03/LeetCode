class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        int arr[]=new int[2];
        arr[0]=arr[1]=-1;
        
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                arr[0]=map.get(target-nums[i]);
                arr[1]=i;
            }
            else{
                map.put(nums[i],i);
            }
            
        }
        return arr;
    }
}