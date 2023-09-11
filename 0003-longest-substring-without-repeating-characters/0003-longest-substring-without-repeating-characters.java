class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        int leftpointer=0;
        int rightpointer=0;
        int ans=Integer.MIN_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        while(rightpointer<s.length())
        {
            
            char ch=s.charAt(rightpointer);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)==2)
            {
                while(leftpointer<rightpointer)
                {
                    ch=s.charAt(leftpointer);
                        map.put(ch,map.get(ch)-1);
                    leftpointer++;
                        if(map.get(ch)==1)
                        {
                            break;
                        }
                    
                }
            }
            int length=rightpointer-leftpointer+1;
            ans=Math.max(ans,length);
            rightpointer++;
        }
        return ans;
    }
}