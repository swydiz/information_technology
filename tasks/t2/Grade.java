package tasks.t2;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer input = console.nextInt(); 
        System.out.println(grade(input));
    }

    public static String grade(int score) {
        if (score < 0 || score > 100) {
            return "Invalid";
        } else if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
