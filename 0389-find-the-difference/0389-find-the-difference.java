class Solution {
    public char findTheDifference(String s, String t) {
       if(t.length()>s.length())
       {
           s=s+" ";
       }
        char answer='y';
        char x[]=s.toCharArray();
        char y[]=t.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        for(int i=0;i<y.length;i++)
        {
            if(x[i]==y[i])
            {
                continue;
            }
            else{
                answer=y[i];
            }
        }
        return answer;
        
    }
}