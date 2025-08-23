class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> mpp = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length != pattern.length()){
            return false;
        }
        StringBuilder sb = new StringBuilder(s);
    
        sb.append(' ');
        s = sb.toString();
       
        int j = 0;
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
             String temp = "";
            while (j < s.length() && s.charAt(j) != ' ') {
                temp = temp + s.charAt(j);
                j++;     
            } 
            j++;

            if (mpp.containsKey(ch)) {
                if (!mpp.get(ch).equals(temp)) {
                    return false;
                }
            } else {
                if (mpp.containsValue(temp)) {
                    return false;
                }
                mpp.put(ch, temp);
            }
        }
        if(j<s.length()){
            return false;
        }
        return true;
    }
}