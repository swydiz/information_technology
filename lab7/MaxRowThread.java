package lab7;

public class MaxRowThread extends Thread {
    private final int[][] matrix;
    private final int rowIndex;
    private int maxInRow = 0; 

    public MaxRowThread(int[][] matrix, int rowIndex) {
        this.matrix = matrix;
        this.rowIndex = rowIndex;
    }

    @Override
    public void run() {
        int[] row = matrix[rowIndex];
        for (int value : row) {
            if (value > maxInRow) {
                maxInRow = value;
            }
        }
    }

    public int getMaxInRow() {
        return maxInRow;
    }
}
