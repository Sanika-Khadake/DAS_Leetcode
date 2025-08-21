class Solution {
    public char findTheDifference(String s, String t) {
       int sum = 0;
       char[] s1 = s.toCharArray();
       char[] t1 = t.toCharArray();
       Arrays.sort(s1);
       Arrays.sort(t1);
        for(int i=0 ; i<s.length() ; i++){
           if(t1[i]!=s1[i]){
             return t1[i];
           }
        }
        return t1[t.length()-1];
    }
}