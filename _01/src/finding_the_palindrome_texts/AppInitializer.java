package finding_the_palindrome_texts;

public class AppInitializer {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }

    private static String isPalindrome(String str) {

        if(str.length() == 1 || str.isEmpty()) return "Yes, It's a Palindrome";

        if (str.charAt(0) == str.charAt(str.length()-1)) {
            String newString = str.substring(1,str.length()-1);
            System.out.println(newString);
             return isPalindrome(newString);
        }

        return "No, Not a palindrome";
    }
}
