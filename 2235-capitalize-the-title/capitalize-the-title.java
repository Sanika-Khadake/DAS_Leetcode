class Solution {
   public String capitalizeTitle(String title) {
    StringBuilder ans = new StringBuilder();
    String[] words = title.toLowerCase().split(" ");

    for (int i = 0; i < words.length; i++) {
        if (words[i].length() <= 2) {
            ans.append(words[i]); // keep lowercase
        } else {
            ans.append(Character.toUpperCase(words[i].charAt(0)))
               .append(words[i].substring(1));
        }
        if (i < words.length - 1) ans.append(" ");
    }

    return ans.toString();
}
}