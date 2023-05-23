
class Solution {
    public int maxArea(int[] height) {
        int leftpointer=0;
        int rightpointer=height.length-1;
        int maxarea=Integer.MIN_VALUE;
        while(leftpointer<rightpointer)
        {
            int width=rightpointer-leftpointer;
            int min=Math.min(height[leftpointer],height[rightpointer]);
            int area=width*min;
                maxarea=Math.max(maxarea,area);
            if(height[leftpointer]<height[rightpointer])
            {
                leftpointer++;
            }
            else{
                
                rightpointer--;
            }
            
            
        }
        return maxarea;
        
    }
}