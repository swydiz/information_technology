package lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class NumberFinder {
    public static void main(String[] args) {
        String exm = "-1234 dkfkd 111.233 djfdko 78,78 87&43 22?d23";
        try {
            Pattern pt = Pattern.compile("-?\\d+([.,]\\d+)?");
            Matcher mt = pt.matcher(exm);
            boolean ans = false;
            while (mt.find()) {
                System.out.println(mt.group());
                ans = true;
            }
            if (!ans) {
                System.out.println("чисел нет");
            }
        } catch (PatternSyntaxException e) {
            System.err.println("ошибка в регулярном выражении: " + e.getMessage());
        }
    }

}
