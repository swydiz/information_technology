package tasks;

import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var num = console.nextInt();
        System.out.println(digitSum(num));
    }

    public static int digitSum(int num) {
        var sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
