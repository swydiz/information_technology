package tasks.t4;

import java.util.Scanner;

public class DigitHistogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine().trim();
        int[] result = digitHistogram(input);
        
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        
        scanner.close();
    }
    
    public static int[] digitHistogram(String numberStr) {
        int[] counts = new int[10]; 
        
        for (char ch : numberStr.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                counts[digit]++;
            }
        }
        
        return counts;
    }
}
