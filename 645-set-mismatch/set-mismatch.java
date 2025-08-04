class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans =new int [2];
        int n= nums.length ;
        int totalSum = n * (n +1) / 2;
         int sum=0;
    for(int i =0 ;i<nums.length ; i++){
        sum=sum+nums[i];
    }
        HashMap<Integer,Integer> mpp=new HashMap<>();
         for(int i=0;i<nums.length;i++){
             if(mpp.containsKey(nums[i])){
                 ans[0] = nums[i]; 
                 int t = sum - ans[0] ;
                 ans[1] = Math.abs(totalSum - t);
                 return ans;
             }
             mpp.put(nums[i],i);
         }
         return ans;

   
    }
}