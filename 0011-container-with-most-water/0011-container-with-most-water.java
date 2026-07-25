class Solution {
    public int maxArea(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int maxarea=0;
        int area=0;
        while(left<right){
        if(arr[left]>arr[right]){
            area=arr[right]*(right-left);
            maxarea=Math.max(maxarea,area);
            right--;
        }
        else{
             area=arr[left]*(right-left);
            maxarea=Math.max(maxarea,area);
            left++;
        }
        }
        return maxarea;
    }
}