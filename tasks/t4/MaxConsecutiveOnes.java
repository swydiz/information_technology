package tasks.t4;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            String input = scanner.nextLine().trim();
            
            input = input.replace("[", "").replace("]", "").replace(" ", "");
            
            if (input.isEmpty()) {
                System.out.println(0);
                return;
            }
            
            String[] strNums = input.split(",");
            int maxCount = 0;
            int currentCount = 0;
            
            for (String strNum : strNums) {
                int num = Integer.parseInt(strNum);
                
                if (num == 1) {
                    currentCount++;
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                    }
                } else {
                    currentCount = 0;
                }
            }
            
            System.out.println(maxCount);
            
            scanner.close();
    }
}
