package tasks.t4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Decode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        input = input.replace("\"", "").replace(" ", "");
        String[] parts = input.split(",");
        
        String message = parts[0];
        String key = parts[1];

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < message.length(); i++) {
            char m = message.charAt(i);
            char k = key.charAt(i % key.length());
            result.add((int)(m ^ k));
        }
        
        System.out.println(result);
        scanner.close();
    }
}