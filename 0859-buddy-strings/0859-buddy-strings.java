class Solution {
    public boolean buddyStrings(String s, String goal) {
        Map<Character,Integer> map=new HashMap<>();
        if(s.length()!=goal.length())
            //first check length of the string if length is not equal then after swaping characters are not equals so we directly return false.
        {
            return false;
        }
        int frequency[]=new int[26];
        if(s.equals(goal))
        {
            //if  s and goal are equals means both the characters
            for(char ch:s.toCharArray())
            {
                frequency[ch-'a']+=1;
                if(frequency[ch-'a']==2)
                {
                    return true;
                }
            }
            return false;
        }
        int firstindex=-1;
        int secondindex=-1;
        //check for the twoindex that we want to swap;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=goal.charAt(i))
            {
                if(firstindex==-1)
                {
                    firstindex=i;
                }
                else if(secondindex==-1)
                {
                    secondindex=i;
                }
                else{
                    return false;
                }
            }
        }
        
        
        if(secondindex==-1)
        {
            return false;
        }
        return s.charAt(firstindex)==goal.charAt(secondindex) && s.charAt(secondindex)==goal.charAt(firstindex);
    }
}