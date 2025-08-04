class Solution {
    public int smallestEvenMultiple(int n) {
        int multiple = n*2;
        if(n%2==0){
            return n;
        }
        if(multiple%2==0){
            return multiple;
        }
        return n;
    }
}