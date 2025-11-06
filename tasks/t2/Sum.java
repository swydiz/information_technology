package tasks.t2;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inp = console.nextLine();
        String[] num = inp.split(",");
        int first = Integer.parseInt(num[0].trim());
        int sec = Integer.parseInt(num[1].trim());
        System.out.println(sumRange(first, sec));
    }

    public static int sumRange(int a, int b) {
        var count = 0;
        for (var i = a; i <= b; i++) {
            count += i;
        }
        return count;
    }
}
