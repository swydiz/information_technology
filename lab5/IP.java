package lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class IP {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String exm = console.nextLine();
        try {
            Pattern pt = Pattern.compile("(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9]\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9])");
            Matcher mt = pt.matcher(exm);
            if (exm.isEmpty()) {
                throw new NullPointerException();
            }
            System.out.println(mt.matches());

        } catch (PatternSyntaxException e) {
            System.err.println("Ошибка в регулярном выражении: " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("IP не может быть null");
        } finally {
            console.close();
        }
    }
}
