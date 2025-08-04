class Solution {
    public int findKthLargest(int[] nums, int k) {
        int count =1 ;
        Arrays.sort(nums);
        // for(int i= nums.length-2 ; i>=0 ;i--){
        //     if( nums[i]<nums[nums.length-1]){
        //         count++;
        //     }
        //     if(count==k){
        //         return nums[i];
        //     }
        // }

        return nums[nums.length- k ];
    }
}