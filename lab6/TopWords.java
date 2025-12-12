package lab6;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class TopWords {
    public static void main(String[] args) {
        File file = new File("lab6/exm.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
        Map<String, Integer> numOfWords = new TreeMap<>();
        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase().trim().replaceAll("[^a-zA-Zа-яА-ЯёЁ]", "");
            if (!word.isEmpty() && word.length() > 1) {
            if (numOfWords.containsKey(word)) {
                int currentCount = numOfWords.get(word);
                numOfWords.put(word, currentCount + 1);
            } else {
                numOfWords.put(word, 1);
            }
        }
                  
        }
        scanner.close();
        Map<String, Integer> sorted = numOfWords.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).
        limit(10).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sorted);  
    }
}
