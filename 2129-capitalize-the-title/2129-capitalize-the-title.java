class Solution {
    public String capitalizeTitle(String title) {
     String str=title.toLowerCase();
        int k=0,endindex;
        char ch[]=str.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
        int firstindex=k;
        if(ch[i]==' '||i==ch.length-1)
        {
            
            if(i==ch.length-1)
            {
                endindex=i;
            }
            else{
                 endindex=i-1;
            }
            if(endindex-firstindex>1)
            {
                ch[firstindex]=Character.toUpperCase(ch[firstindex]);
              
            }
              k=i+1;
            
        }
        else{
                continue;
            }
    }
        return new String(ch);
        
    }
}