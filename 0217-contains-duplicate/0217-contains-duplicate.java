class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int b=nums[i];
            if(map.containsKey(b)){
                return true;
            }
            else{
                map.put(b,i);
            }
        }
        return false;
    }
}