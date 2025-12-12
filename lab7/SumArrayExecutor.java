package lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumArrayExecutor {
    public static void main(String[] args) {

        int[] array = new int[2_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }

        final int th_count = 4;

        ExecutorService executor = Executors.newFixedThreadPool(th_count);
        
        List<Future<Long>> results = new ArrayList<>();

        int partSize = array.length / th_count;

        for (int i = 0; i < th_count; i++) {
            int start = i * partSize;
            int end;
            if (i == th_count - 1) {
                end = array.length;
            } else {
                end = start + partSize;
            }

            results.add(executor.submit(new SumTask(array, start, end)));
        }

        executor.shutdown();

        long totalSum = 0;
        try {
            for (Future<Long> future : results) {
                totalSum += future.get();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Общая сумма элементов массива = " + totalSum);
    }
}
