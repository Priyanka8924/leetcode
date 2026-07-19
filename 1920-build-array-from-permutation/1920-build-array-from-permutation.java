class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans =new int[nums.length];
        int[] arr = new int[5];
    for(int i=0;i<nums.length;i++){
        ans[i]=nums[nums[i]];
    }
    return ans;
    }
}