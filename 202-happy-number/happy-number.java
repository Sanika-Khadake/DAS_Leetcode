class Solution {
    public static int squareNum(int n){
        int squ  =0 ;
           while(n!=0){
            int r = n % 10;
            squ += r*r;
            n = n/10;
           }
           return squ;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> hset = new HashSet<>();
        while(true){
            n = squareNum(n) ;
            if(n==1){
                return true;
            }
            if(hset.contains(n)){
                return false ;
            } 
            hset.add(n);
        }
    }
}