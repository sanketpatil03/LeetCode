class Solution {
    public String removeTrailingZeros(String num) {
        int n=num.length()-1;
        while(n>=0)
        {
            if(num.charAt(n)!='0')
            {
               break;
            }
            n--;
            
        }
        return num.substring(0,++n);
        
    }
}