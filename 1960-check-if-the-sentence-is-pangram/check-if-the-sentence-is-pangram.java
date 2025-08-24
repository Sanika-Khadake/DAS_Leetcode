class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char ch='a' ; ch<='z'; ch++){
            boolean flag = false;
            for(int i=0;i<sentence.length() ; i++){
                if(ch==sentence.charAt(i)){
                    flag =true;
                    break;
                }
            }
            if(flag == false){
                return false;
            }
        }
        return true;
    }
}