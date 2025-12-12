package tasks.t4;

import java.util.*;

public class GradeEvaluator {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().trim();
        
        line = line.replace("[", "").replace("]", "");
        String[] parts = line.split(",");
        
        int[] counts = new int[5];
        int total = 0;
        
        for (String part : parts) {
            String trimmed = part.trim();
            if (!trimmed.isEmpty()) {
                int grade = Integer.parseInt(trimmed);
                
                if (grade == 0) {
                    continue;
                }
                
                if (grade >= 90) counts[0]++;      // A
                else if (grade >= 80) counts[1]++; // B
                else if (grade >= 70) counts[2]++; // C
                else if (grade >= 60) counts[3]++; // D
                else if (grade >= 1) counts[4]++;  // F (только от 1 до 59)
                
                total++;
            }
        }
        
        List<String> resultParts = new ArrayList<>();
        
        if (counts[0] > 0) resultParts.add("A: " + counts[0]);
        if (counts[1] > 0) resultParts.add("B: " + counts[1]);
        if (counts[2] > 0) resultParts.add("C: " + counts[2]);
        if (counts[3] > 0) resultParts.add("D: " + counts[3]);
        if (counts[4] > 0) resultParts.add("F: " + counts[4]);
        
        System.out.println("{" + String.join(", ", resultParts) + "}");
        
        scanner.close();
    }
}
