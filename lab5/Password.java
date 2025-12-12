package lab5;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String exm = console.nextLine();
        try {
            Pattern pt = Pattern.compile("(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d@]{8,16}");
            Matcher mt = pt.matcher(exm);
            if (exm.isEmpty()) {
                throw new IllegalArgumentException("Пароль не может быть пустым");
            }
            if (mt.matches()) {
                System.out.println("Пароль верный");
            } 

        } catch (PatternSyntaxException e) {
            System.err.println("Ошибка в регулярном выражении: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {
            console.close();
        }
    }

   
}
