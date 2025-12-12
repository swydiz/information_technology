package tasks.t4;

import java.util.Scanner;

public class Repeat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String result = nonRepeat(input);
        System.out.println(result);
        
        scanner.close();
    }
    
    public static String nonRepeat(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        String lowerStr = str.toLowerCase();
        int[] freq = new int[256];
        
        for (int i = 0; i < lowerStr.length(); i++) {
            freq[lowerStr.charAt(i)]++;
        }
        
        return buildResult(str, lowerStr, freq, 0);
    }
    
    private static String buildResult(String original, String lower, int[] freq, int index) {
        if (index >= original.length()) {
            return "";
        }
        
        char currentLower = lower.charAt(index);
        char currentOriginal = original.charAt(index);
        
        String rest = buildResult(original, lower, freq, index + 1);
        
        if (freq[currentLower] <= 3) {
            return currentOriginal + rest;
        } else {
            return rest;
        }
    }
}

