class Solution {
    public boolean rotateString(String s, String goal) {
       StringBuilder str = new StringBuilder(s);
        int n = s.length();

        while(n>0){
            if(str.toString().equals(goal)) return true;
            char ch = str.charAt(0);
            str.deleteCharAt(0);
            str.append(ch);
            n--;
        }
        return false;
    }
}