package tasks;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var num = console.nextInt();
        System.out.println(isEven(num));
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
