package lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpperCase {
    public static void main(String[] args) { 
        String exm = "helloWorld thisIsTest пример aBcDeFg приМер";
        Pattern pt = Pattern.compile("([a-zа-я][A-ZА-Я])");
        Matcher mt = pt.matcher(exm);
        String ans = mt.replaceAll("!$1!");
        System.out.println(ans);
    }
}
