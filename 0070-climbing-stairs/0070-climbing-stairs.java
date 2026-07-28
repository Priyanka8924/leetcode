class Solution {
    public int climbStairs(int n) {
        int step1=1;
        int step2=2;
        int current=0;
      
        if(n<=2){
            return n;
        }
        for(int i=3;i<=n;i++){
          current= step1+step2;
          step1=step2;
          step2=current;
        }
return current;
    }
}