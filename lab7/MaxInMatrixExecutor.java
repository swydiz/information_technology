package lab7;

import java.util.*;
import java.util.concurrent.*;

public class MaxInMatrixExecutor {
    public static void main(String[] args) {

        int rows = 10_000;
        int cols = 5_000;
        int[][] matrix = new int[rows][cols];

        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(1_000_000); 
            }
        }

        // Вставим максимум, чтобы точно знать ответ (для проверки)
        matrix[7532][1247] = 999_999;


        final int th_count = 8;
        try (ExecutorService executor = Executors.newFixedThreadPool(th_count)) {

            List<Future<Integer>> results = new ArrayList<>();

            int rowsPerThread = rows / th_count;

            for (int i = 0; i < th_count; i++) {
                int startRow = i * rowsPerThread;
                int endRow; 

                if (i == th_count - 1) {
                    endRow = rows;                
                } else {
                    endRow = startRow + rowsPerThread;
                }

                results.add(executor.submit(new MaxInPartTask(matrix, startRow, endRow)));
            }

            int globalMax = 0;

            for (Future<Integer> future : results) {
                int partMax = future.get();          
                if (partMax > globalMax) {
                    globalMax = partMax;
                }
            }

            System.out.println("Наибольший элемент во всей матрице = " + globalMax);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}