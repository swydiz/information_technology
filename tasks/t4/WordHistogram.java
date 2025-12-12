package tasks.t4;

import java.util.*;

public class WordHistogram {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        
        String[] words = line.split("\\s+");
        
        for (String word : words) {
            String cleanWord = word.toLowerCase()
                .replaceAll("[^a-zа-яё]", "");
            
            if (!cleanWord.isEmpty()) {
                wordCount.put(cleanWord, wordCount.getOrDefault(cleanWord, 0) + 1);
            }
        }
        
        System.out.println(formatOutput(wordCount));
        
        scanner.close();
    }
    
    private static String formatOutput(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return "{}";
        }
        
        StringBuilder result = new StringBuilder("{");
        int i = 0;
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(entry.getKey()).append(": ").append(entry.getValue());
            i++;
        }
        
        result.append("}");
        return result.toString();
    }
}