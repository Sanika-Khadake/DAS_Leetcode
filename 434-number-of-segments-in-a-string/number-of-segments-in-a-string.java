class Solution {
    public int countSegments(String s) {
        int count = 0;
        s=s.trim();
        if(s.length()==0){
            return 0 ;
        }
      /*  for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)==' '){
               count++; 
            }
        }
        return count+1 ; */
        String[] words = s.trim().split("\\s+");
        return words.length;
    }
}