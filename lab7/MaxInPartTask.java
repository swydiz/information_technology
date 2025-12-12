package lab7;

import java.util.concurrent.Callable;

class MaxInPartTask implements Callable<Integer> {
    private final int[][] matrix;
    private final int fromRow;
    private final int toRow;

    public MaxInPartTask(int[][] matrix, int fromRow, int toRow) {
        this.matrix = matrix;
        this.fromRow = fromRow;
        this.toRow = toRow;
    }

    @Override
    public Integer call() {
        int max = 0;

        for (int i = fromRow; i < toRow; i++) {
            int[] row = matrix[i];
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }
}
