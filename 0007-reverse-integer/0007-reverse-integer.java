class Solution {
    public int reverse(int x) {
        long ans=0;
        int k=x;
        // if(k<0){
        //     k*=(-1)*k;
        // }
        while(x!=0)
            {
                int rem=x%10;
                ans=ans*10+rem;
                x=x/10;
               // k=k/10;
            }
        if(ans<Math.pow(-2,31) || ans>Math.pow(2,31) )
            return 0;
        else 
            return (int)ans;
    }
}