class Solution {
    public String addStrings(String num1, String num2) {
        if(num1.equals("0")&&num2.equals("0"))
        {
            String str="0";
            return str;
        }
       int i=num1.length()-1;
        int j=num2.length()-1;
        
        int carry=0;
        int sum1=0;
        StringBuilder str=new StringBuilder("");
        while(i>=0 || j>=0 || carry!=0)
        {
            int x= (i>=0) ? num1.charAt(i)-'0' : 0;
            int y= (j>=0) ? num2.charAt(j)-'0' : 0;
            
            int sum=x+y+carry;
            carry=sum/10;
        str.append(sum%10);
           i--;
            j--;
        }
        return str.reverse().toString();
    }
}