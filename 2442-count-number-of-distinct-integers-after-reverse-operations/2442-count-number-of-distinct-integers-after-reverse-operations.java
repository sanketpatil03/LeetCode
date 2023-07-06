class Solution {
    public int countDistinctIntegers(int[] nums) {
    int arr[]=new int[nums.length*2];
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            arr[i]=nums[i];
            int reverse=0;
            int num=nums[i];
            while(num!=0)
            {
                int rem=num%10;
                reverse=reverse*10+rem;
                num=num/10;
            }
           arr[i+n]=reverse;
        }
        Map<Integer,Integer>map=new HashMap<>();
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                continue;
            }
            else{
                map.put(arr[i],i);
                k++;
            }
        }
        return k;
    }
}