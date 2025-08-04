class Solution {
    public int singleNumber(int[] nums) {
      

        // for(int i = 0 ; i<nums.length ;i++){
        //    int count = 0;
        //     for(int j= 0 ;j<nums.length ;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count==1){
        //         return nums[i];
        //     }
        // } 
        // return -1;

        int x=0;
        for(int i=0; i<nums.length ; i++){
            x = x ^ nums[i];
        }
        return x;
    }
}