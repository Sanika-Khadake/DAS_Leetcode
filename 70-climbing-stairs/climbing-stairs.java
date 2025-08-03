class Solution {
    public int climbStairs(int n) {
        if(n<=0){
            return n;
        }
        int prev=0;
        int prev2=1;
        for(int i=2 ; i<=n+1 ; i++){
           int temp = prev+ prev2;
           prev = prev2 ;
           prev2 = temp ; 
        }
        return prev2;
    }
}