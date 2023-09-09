class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int counter=0;
        if(s.length()==1)
        {
            return 1;
        }
       int n=s.length()-1;
        for(int i=n;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                break;
            }
            else{
                counter++;
            }
        }
        return counter;
       
    }
}