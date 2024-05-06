class Solution {
    public int countPrimes(int n) {
        if(n<=2)
        {
            return 0;
        }
        boolean primearray[]=new boolean[n];
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(primearray[i]==false)
            {
                for(int j=i*i;j<n;j+=i)
                {
                    primearray[j]=true;
                }
            }
        }
        
        for(int i=2;i<n;i++)
        {
            if(primearray[i]==false)
            {
                count++;
            }
        }
        return count;
    }
}