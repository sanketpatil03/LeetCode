class Solution {
    public int largestRectangleArea(int[] heights) {
        //next smallest right
        int nr[]=new int [heights.length];
        int nl[]=new int [heights.length];
        Stack<Integer> s=new Stack<>();
        
        for(int i=heights.length-1;i>=0;i--)
        {
            while(!s.isEmpty()&& heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nr[i]=heights.length;
            }
            else{
                nr[i]=s.peek();
            }
            s.push(i);
        }
        s=new Stack<>();
        for(int i=0;i<heights.length;i++)
        {
            while(!s.isEmpty()&&heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nl[i]=-1;
            }
            else{
                nl[i]=s.peek();
            }
            s.push(i);
        }
        int maxarea= Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++)
        {
            int width=nr[i]-nl[i]-1;
            int height=heights[i];
            int area=width*height;
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;
    }
}