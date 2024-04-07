package find_the_smallest_word_in_a_String;

public class AppInitializer {
    public static void main(String[] args) {
        String str = "Find the smallest word in this String";
        System.out.println(findTheSmallestWord(str));

    }

    private static String findTheSmallestWord(String str) {
        String[] strings = str.split("\\s+");
        int smallestCharacter = strings[0].length();
        String smallestWord = strings[0];

        for (String string : strings) {
            smallestWord = smallestCharacter > string.length() ? string : smallestWord;
            smallestCharacter = smallestCharacter > string.length() ? string.length() : smallestCharacter;
        }
        return smallestWord;
    }
}
