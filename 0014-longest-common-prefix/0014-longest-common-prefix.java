class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s3="";
        if(strs.length==0)
        {
            return s3;
        }
        String s1=strs[0];
        String s2=strs[strs.length-1];
        
        int i=0;
        while(s1.length()>i && s2.length()>i)
        {
            if(s1.charAt(i)==s2.charAt(i)){
                s3=s3+s1.charAt(i);
            i++;
            }
            else{
                break;
                }
            
            
        }
        return s3;
        
    }
}