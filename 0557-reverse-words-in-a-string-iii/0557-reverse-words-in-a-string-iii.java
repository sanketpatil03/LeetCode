class Solution {
    public String reverseWords(String s) {
        char ch[]=s.toCharArray();
        int k=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==' '||i==ch.length-1)
            {
                int start=k;
                int end;
                if(i==ch.length-1)
                {
                    end=i;
                }
                else{
                     end=i-1;
                }
                
                while(start<end)
                {
                    char temp=ch[start];
                    ch[start]=ch[end];
                    ch[end]=temp;
                    start++;
                    end--;
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