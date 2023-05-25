class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int number=0;
            int orgnum=x;
        while(x!=0)
        {
            int rem=x%10;
            number=number*10+rem;
            x=x/10;
        }
        if(orgnum==number)
        {
            return true;
        }
        return false;
    }
}