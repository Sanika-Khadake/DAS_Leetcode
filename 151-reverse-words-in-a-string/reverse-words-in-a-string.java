class Solution {
   public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int end = s.length() - 1;

        while (end >= 0) {
            // Skip trailing spaces
            while (end >= 0 && s.charAt(end) == ' ') {
                end--;
            }
            if (end < 0) break;

            int start = end;
            // Move start backward to find beginning of the word
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }

            // Append the word
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(s.substring(start + 1, end + 1));

            // Move end before this word
            end = start - 1;
        }
        return result.toString();
    }
}