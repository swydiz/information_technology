package tasks.t2;
import java.util.Arrays;
import java.util.Scanner;

public class EvenDigit {
     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var num = console.nextLine();;
        System.out.println(odd(num)[0] + ", " + odd(num)[1]);
    }

    public static int[] odd(String num) {
        var chet = 0;
        var ne = 0;
        var n = Math.abs(Integer.parseInt(num));
        if (n==0) {
            return new int[]{1, 0};
        } else {
            while (n > 0) {
            var b = n%10;
            if (b%2==0) {
                chet++;
            } else {
                ne++;
            }
            n = n/10;
        } }
        return new int[]{chet, ne};
    }
}
