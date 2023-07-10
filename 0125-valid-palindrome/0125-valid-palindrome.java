class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character>list=new ArrayList<>();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z'|| s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
                list.add(s.charAt(i));
            }
            else{
                continue;
            }
        }
        
        int start=0;
        int end=list.size()-1;
        while(start<end)
        {
            if(list.get(start)==list.get(end))
            {
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}