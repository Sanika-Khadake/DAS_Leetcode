 class Solution {

  //Using dynamic programming
   public int fibs(int n,  int[] dp){
      if(n<=1){
        return n;
      }
      if(dp[n]!=-1){
        return dp[n];
      }

      dp[n]=fibs(n-1,dp)+fibs(n-2,dp);
      return dp[n];
   }

    public int fib(int n) {
       int[] dp = new int[n+1];
       for(int i=0 ;i <n+1 ;i++){
            dp[i] = -1 ;
        }
        return fibs(n,dp);   
    }
    
}