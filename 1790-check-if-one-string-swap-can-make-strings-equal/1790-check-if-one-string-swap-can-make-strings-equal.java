class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
            int firstindex=-1;
                int secondindex=-1;
            if(s1.equals(s2))
            {
                return true;
            }
            else if(s1.length()==s2.length())
            {
                for(int i=0;i<s1.length();i++)
                {
                    if(s1.charAt(i)!=s2.charAt(i))
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
                
            }
        if(secondindex==-1)
        {
            return false;
        }
        return s1.charAt(firstindex)==s2.charAt(secondindex)&& s1.charAt(secondindex)==s2.charAt(firstindex);
        
    }   
}