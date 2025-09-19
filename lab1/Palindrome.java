public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String str = args[i];
            System.out.println(str + " " + isPalindrome(str));
        }
    }

    public static String reverseString(String str) {
        String newString = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            newString += str.charAt(i);
        }
        return newString;
    }

    public static boolean isPalindrome(String str) {
        return reverseString(str).equals(str);
    }
}