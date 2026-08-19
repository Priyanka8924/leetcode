class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
        while(i<j){

       
                int x=Math.min(height[i],height[j]);
                int maximum=x*(j-i);
                max=Math.max(max,maximum);
                if(height[i]<height[j]){
                    i++;
                }
                else{
                    j--;
                }
        } 
        return max;
    }
}