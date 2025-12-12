package tasks.t4;

import java.util.*;

public class PairDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            String line = scanner.nextLine().trim();
            
            // Разбираем строку
            line = line.replace("[", "").replace("]", "");
            
            // Разделяем по запятой
            String[] parts = line.split(",");
            
            if (parts.length < 2) {
                System.out.println(0);
                return;
            }
            
            // Последний элемент - это k
            int k = Integer.parseInt(parts[parts.length - 1].trim());
            
            // Остальные элементы - это массив
            int[] nums = new int[parts.length - 1];
            for (int i = 0; i < parts.length - 1; i++) {
                nums[i] = Integer.parseInt(parts[i].trim());
            }
            
            int result = countPairs(nums, k);
            System.out.println(result);
            
        } catch (Exception e) {
            System.out.println(0);
        } finally {
            scanner.close();
        }
    }
    
    public static int countPairs(int[] nums, int k) {
        if (nums.length < 2 || k < 0) {
            return 0;
        }
        
        // Используем HashMap для хранения чисел
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int count = 0;
        
        if (k == 0) {
            // Если k=0, считаем числа, которые встречаются хотя бы 2 раза
            for (int frequency : map.values()) {
                if (frequency >= 2) {
                    count++;
                }
            }
        } else {
            // Для k>0 ищем пары
            Set<Integer> used = new HashSet<>();
            for (int num : map.keySet()) {
                // Проверяем только в одном направлении, чтобы не считать дважды
                if (!used.contains(num)) {
                    if (map.containsKey(num + k)) {
                        count++;
                    }
                    used.add(num);
                }
            }
        }
        
        return count;
    }
}