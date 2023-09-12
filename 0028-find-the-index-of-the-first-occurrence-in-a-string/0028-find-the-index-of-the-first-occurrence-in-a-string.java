class Solution {
    public int strStr(String haystack, String needle) {
       int hayLen = haystack.length();
        int needleLen = needle.length();
        if(haystack.length()<needle.length())
        {
            return -1;
        }
        for(int i=0;i<=hayLen-needleLen;i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                int j=1;
                while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                {
                    j++;
                }
                if(j==needle.length())
                {
                    return i;
                }
            }
            
        }
        return -1;
    }
}