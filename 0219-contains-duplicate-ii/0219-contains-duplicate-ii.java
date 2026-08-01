class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
          int b=nums[i];

            if(map.containsKey(b))
            {
                int j=map.get(b);
                if((i-j)<=k){
                    return true;
                }
                 else{
            map.put(b,i);
            }
            }
              else{
            map.put(b,i);
        }
        }
      
        return false;
    }
}