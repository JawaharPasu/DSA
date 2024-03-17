package algorithms;

public class Recursion {

    public static String reverse(String word) {
        if (word.isEmpty()) return "";
        String rev = word.substring(word.length()-1, word.length());
        return  rev + reverse(word.substring(0, word.length()-1));
    }

    public static boolean palindrome(String word) {
        if (word.length()<=1) return true;
        if (word.charAt(0) != word.charAt(word.length()-1)) return false;
        return palindrome(word.substring(1,word.length()-1));
    }
}
