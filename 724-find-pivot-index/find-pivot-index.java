class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int i=0 ;i<nums.length ; i++){
            totalSum = totalSum+nums[i];
        }
        int leftSum = 0 ;
        int rightSum = totalSum;
        for(int j=0 ;j<nums.length ; j++){
          rightSum = rightSum- nums[j];
          if(leftSum == rightSum){
            return j ;
          }
          leftSum=leftSum+nums[j];
        }
        return -1;
    }
}