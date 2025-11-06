package tasks.t1;

import java.util.Scanner;

public class Prime {
     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var num = console.nextInt();
        System.out.println(isPrime(num));
     }

     public static boolean isPrime(int num) {
        for (var i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
     }
}
