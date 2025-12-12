package tasks.t4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] parts = input.split(",");
        
        int n = Integer.parseInt(parts[0].trim());
        int k = Integer.parseInt(parts[1].trim());
            
        List<String> result = bruteForce(n, k);
        System.out.println(formatResult(result));
        
        scanner.close();
    }
    
    public static List<String> bruteForce(int n, int k) {
        List<String> result = new ArrayList<>();

        if (n > k) {
            return result;
        }
        
        boolean[] used = new boolean[k];
        generateAllCombinations(n, k, "", used, result);
        
        return result;
    }
    
    private static void generateAllCombinations(int n, int k, String current, 
                                                boolean[] used, List<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }
        
        for (int i = 0; i < k; i++) {
            if (!used[i]) {
                used[i] = true;
                
                generateAllCombinations(n, k, current + i, used, result);
                
                used[i] = false;
            }
        }
    }
    
    private static String formatResult(List<String> list) {
        if (list.isEmpty()) {
            return "[]";
        }
        
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append("\"").append(list.get(i)).append("\"");
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}