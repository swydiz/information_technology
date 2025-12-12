package lab7;

import java.util.concurrent.Callable;

public class SumTask implements Callable<Long> {
    private final int[] arr;
    private final int from;
    private final int to;    

    public SumTask(int[] arr, int from, int to) {
        this.arr = arr;
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() {
        long sum = 0;
        for (int i = from; i < to; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
