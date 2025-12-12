package lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class CharSearch {
    public static void main(String[] args) {
        String text = "ApPle, orange, banana, Pineapple, berry, grape, Cherry.";
        Scanner console = new Scanner(System.in);
        String exm = console.nextLine();
        
        try {
            if (exm.isEmpty()) {
                System.out.println("Буква не может быть null");
                return;
            }
            if (exm.length() > 1) {
                System.out.println("Напишите одну букву");
                return;
            }
            
            Pattern pt = Pattern.compile("\\b" + exm + "[a-z]*\\b", Pattern.CASE_INSENSITIVE);
            Matcher mt = pt.matcher(text);
            
            boolean ans = false;
            while (mt.find()) {
                System.out.println(mt.group());
                ans = true;
            }
            
            if (!ans) {
                System.out.println("Слов не нашлось");
            }
            
        } catch (PatternSyntaxException e) {
            System.err.println("ошибка в регулярном выражении: " + e.getMessage());
        } finally {
            console.close();
        }
    }
}