class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String n = s+s;
        int i=0 ;
        int j=0 ;
        while(i<n.length()){
           if(n.charAt(i) == goal.charAt(j)){
             i++;
             j++;
            if(j==goal.length()){
               return true;
              }
            }
           else{
               i = i-j+1;
               j=0;
           }
        }

        return false;
    }
}