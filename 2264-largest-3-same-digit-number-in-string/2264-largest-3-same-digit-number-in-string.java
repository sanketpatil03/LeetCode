class Solution {
    public String largestGoodInteger(String num) {
       String s="";
         String ans="";
        if(num.length()==0)
        {
            return s;
        }
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<num.length()-2;i++)
        {
                                    if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i)==num.charAt(i+2))
            {
                s=s+num.charAt(i);
                s=s+num.charAt(i);
                s=s+num.charAt(i);                
                int n=Integer.parseInt(s);
            maximum=Math.max(maximum,n);
            s="";                
            }
            else{
                continue;
            }
            
            
        }
        if(maximum==0)
        {
            return "000";
        }
        else if(maximum>0){
             ans=Integer.toString(maximum);
        return ans;
}
        return "";
        
  
    }
}