class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        int TwoSum[]=new int[2];
        for(int i=0;i<numbers.length;i++)
        {
            if(map.containsKey(target-numbers[i]))
            {
                TwoSum[0]=map.get(target-numbers[i])+1;
                TwoSum[1]=i+1;
            }
            else{
                map.put(numbers[i],i);
            }
        }
        return TwoSum;
    }
}