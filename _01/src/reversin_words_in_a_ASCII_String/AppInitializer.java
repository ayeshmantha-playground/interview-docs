package reversin_words_in_a_ASCII_String;


import java.util.Arrays;

public class AppInitializer {
    public static void main(String[] args) {
        String words = "This is the best code ever";
        System.out.println(reverseWords(words));
    }

    static String reverseWords(String input) {
        String[] wordArrays = input.split("\\s+");// using regex to split the strings from "space";
        for (int i = 0; i < wordArrays.length/2; i++) {
            String temp = wordArrays[i];
            wordArrays[i] = wordArrays[wordArrays.length - 1 - i];
            wordArrays[wordArrays.length - 1 -i] = temp;
        }

        String reverse = "";

        for (String wordArray : wordArrays) {
            reverse += (wordArray)+" ";
        }
        return reverse;
    }
}
