package tasks.t3;

import java.util.Scanner;

public class Fib {
     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int inp = console.nextInt();
        System.out.println(fibonacci(inp));
    } 

    public static int fibonacci(int inp) {
        if (inp == 0) {
            return 0;
        }
        if (inp == 1) {
            return 1;
        }
        return fibonacci(inp - 1) + fibonacci(inp - 2);
    } 
}
