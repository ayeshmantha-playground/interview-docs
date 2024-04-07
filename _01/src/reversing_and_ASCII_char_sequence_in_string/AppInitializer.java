package reversing_and_ASCII_char_sequence_in_string;

public class AppInitializer {
    //Reversing and ASCII char sequence in a string
    public static void main(String[] args) {

        String str = "Hello world";
        System.out.println(reverString(str));

    }

    private static String reverString(String str) {

        if(str.isEmpty()) return "";

        return reverString(str.substring(1))+ str.charAt(0);

    }


}
