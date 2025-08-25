class Solution {
    public static boolean checkOccurance(String num){
        for(int i=0 ;i <num.length() ; i++){
            int target = num.charAt(i)-'0';
            int count = 0;
            for(int j=0 ; j<num.length() ; j++){
                int temp = num.charAt(j)-'0';
                if(i==temp) {
                    count++;
                }
                if(count>target){
                    return false;
                }
            }
            if(count!=target){
                return false;
            }
        }
        return true;

    }
    public boolean digitCount(String num) {
       if(checkOccurance(num)){
         return true;
       }
       else{
        return false;
       }
    }
}