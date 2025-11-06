package tasks.t2;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var num = console.nextInt();
        System.out.println(countDivisors(num));

    }

    public static int countDivisors(int num) {
        var count = 0;
        for (var i = 1; i <= num; i++) {
            if (num%i == 0) {
                count += 1;
            }
            
        }
        return count;
    }
}
