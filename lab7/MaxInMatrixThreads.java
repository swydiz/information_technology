package lab7;

import java.util.Random;

public class MaxInMatrixThreads {
    public static void main(String[] args) {

        int rows = 10;
        int cols = 8;
        int[][] matrix = new int[rows][cols];

        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(1000);
            }
        }

        System.out.println("Матрица:");
        printMatrix(matrix);

        MaxRowThread[] threads = new MaxRowThread[rows];

        for (int i = 0; i < rows; i++) {
            threads[i] = new MaxRowThread(matrix, i);
            threads[i].start();
        }

        for (int i = 0; i < rows; i++) {
            try {
                threads[i].join();                     
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int globalMax = 0;
        for (int i = 0; i < rows; i++) {
            int rowMax = threads[i].getMaxInRow();
            if (rowMax > globalMax) {
                globalMax = rowMax;
            }
        }

        System.out.println("Наибольший элемент во всей матрице = " + globalMax);
    }

    // Красивая печать матрицы
    private static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int x : row) {
                System.out.printf("%4d", x);
            }
            System.out.println();
        }
        System.out.println();
    }
}


