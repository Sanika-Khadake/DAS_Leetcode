class Solution {
    public int countDigits(int num) {
        int org = num ;
        int count = 0;

        while(num>0){
            int r =num%10;
            if(org % r == 0){
                count++;
            }
            num=num/10;
        }
        return count;
    }
}