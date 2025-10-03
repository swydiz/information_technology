package tasks;

import java.util.Scanner;

public class Palindrome {
     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var str = console.nextLine();
        System.out.println(isPalindrome(str));
     }

     public static boolean isPalindrome(String str) {
        var reverseStr = "";
        for (var i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr.equals(str);
     }
}
