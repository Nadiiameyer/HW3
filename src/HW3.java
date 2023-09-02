public class HW3 {
    public static String findLongestWord(String word1, String word2, String word3) {
        if (word1.length() >= word2.length() && word1.length() >= word3.length()) {
            return word1;
        } else if (word2.length() >= word1.length() && word2.length() >= word1.length()) {
            return word2;
        } else {
            return word3;
        }
    }

    public static void main(String[] args) {
        String word1 = "Bonn";
        String word2 = "Cologne";
        String word3 = "Munich";

        String longestWord = findLongestWord(word1, word2, word3);
        System.out.println("The longest word is: " + longestWord);
    }
}
