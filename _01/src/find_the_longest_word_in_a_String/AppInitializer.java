package find_the_longest_word_in_a_String;

public class AppInitializer {
    public static void main(String[] args) {
        String str = "I want to find the longest character in this string";
        System.out.println(findTheLongestWord(str));
    }

    private static String findTheLongestWord(String str) {
        String[] strings = str.split("\\s+");
        int maxCharacters = strings[0].length();
        String longestWord = strings[0];
        for (String string : strings) {
            longestWord = maxCharacters < string.length() ? string : longestWord;
            maxCharacters = maxCharacters < string.length() ? string.length() : maxCharacters;
        }
        System.out.println(maxCharacters);
        return longestWord;
    }
}


