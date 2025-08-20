class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i=left ; i<=right ;i++){
            String s=words[i];
            
            char chf =s.charAt(0);
            char chl=s.charAt(s.length()-1);
            if((chf == 'a' || chf=='e' || chf=='i' || chf=='o' || chf=='u' ) && (chl == 'a' || chl=='e' || chl=='i' || chl=='o' || chl=='u' )){
               count++;
            }
        }
        return count;
    }
}