package tasks.t2;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String cleaned = input.replaceAll("[\\[\\] ]", "");
        
        String[] rows = cleaned.split(",");
        
        int size = (int) Math.sqrt(rows.length);
        int[][] matrix = new int[size][size];
        
        int index = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Integer.parseInt(rows[index]);
                index++;
            }
        }
        System.out.println(diagonalSum(matrix));
    }

    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
    for (int i=0; i< matrix.length; i++) {
        sum += matrix[i][i];
    }  return sum;
    }
   
}
