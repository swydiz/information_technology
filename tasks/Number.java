package tasks;

import java.util.Scanner;

public class Number {
     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var num1  = console.nextDouble();
        var num2  = console.nextDouble();
        var num3  = console.nextDouble();
        System.out.println(average(num1, num2, num3));
    }

    public static double average(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}
