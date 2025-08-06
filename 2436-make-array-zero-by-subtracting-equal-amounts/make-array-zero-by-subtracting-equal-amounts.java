class Solution {
    public int smallFind(int[] nums){
        int small = Integer.MAX_VALUE; 
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0 && nums[i] < small){
                small = nums[i];
            }
        }
        return small;
    }

    public boolean isZero(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                return false;
            }
        }
        return true;
    }

    public int minimumOperations(int[] nums) {
        int count = 0;
        while (!isZero(nums)) {
            int small = smallFind(nums);
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0){
                    nums[i] -= small;
                }
            }
            count++;
        }
        return count;
    }
}
