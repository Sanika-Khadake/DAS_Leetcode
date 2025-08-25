class Solution {
    public static boolean checkDivide(int n){
        int org = n;
        while(n>0){
           int r = n % 10;
           if(r==0){
             return false;
           }
            if(org % r !=0){
             return false;
            }
           
           n = n/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> alist = new ArrayList<>();
        while(left<=right){
          if(checkDivide(left)){
            alist.add(left);
          }
         left++;
        }
        return alist;
    }
}