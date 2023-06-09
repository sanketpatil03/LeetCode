class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        if(s.length()==t.length())
        {
            char sc[]=s.toCharArray();
            char tc[]=t.toCharArray();
            Arrays.sort(sc);
            Arrays.sort(tc);
           if( Arrays.equals(sc,tc))
           {
               return true;
           }
            else{
                return false;
            }
            
        }
        return false;
    }
}