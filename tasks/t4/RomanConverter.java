package tasks.t4;

import java.util.Scanner;

public class RomanConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        String result = convertToRome(number);
        System.out.println(result);
        
        scanner.close();
    }
    
    public static String convertToRome(int number) {
        if (number <= 0 || number > 1502) {
            return "";
        }
        
        String[] thousands = {"", "M"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        int thousand = number / 1000;
        int hundred = (number % 1000) / 100;
        int ten = (number % 100) / 10;
        int one = number % 10;
        
        StringBuilder roman = new StringBuilder();
        
        if (thousand > 0) {
            roman.append(thousands[thousand]);
        }
        
        roman.append(hundreds[hundred]);
        
        roman.append(tens[ten]);
        
        roman.append(ones[one]);
        
        return roman.toString();
    }
}
