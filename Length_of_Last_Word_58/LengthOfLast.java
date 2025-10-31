package Length_of_Last_Word_58;

public class LengthOfLast {
    public static void main(String[] args) {
        String s = "Hello World  ";
        System.out.println("Length of last word: " + lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        String lastWord = words[words.length - 1];
        return lastWord.length();
    }
}