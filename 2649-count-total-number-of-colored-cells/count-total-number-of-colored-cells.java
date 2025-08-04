class Solution {
    public long coloredCells(int n) {
        if(n==1){
            return 1;
        }
        long num = (long) n;
        long p= n-1;
        long coloredCell = (num * num) + (p * p) ;
        return coloredCell;
    }
}