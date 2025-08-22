class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       List<Integer> alist = new ArrayList<>() ;
       int  i = num.length-1;
       int carry=0;
       int sum =0 ;
       while(i>=0  || k>0 || carry>0){
          int d1 = k%10 ;
          int d2 =0 ;
          if(i>=0){
            d2 = num[i];
          }
          sum = d1 + d2 +carry;
          alist.add(sum%10);
          carry = sum/10 ;
          i--;
          k = k/10;
       } 
       Collections.reverse(alist);
       return alist;

    }
}